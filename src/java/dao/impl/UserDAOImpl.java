/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.UserDAO;
import java.sql.SQLException;
import bean.User;
import bean.UserDto;
import dao.BaseDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.StringValidation;

/**
 *
 * @author cyv2098
 */
public class UserDAOImpl extends BaseDao implements UserDAO {

    private static final Logger log = Logger.getLogger(UserDAOImpl.class.getName());

    @Override
    /**
     * insert staff information from Staff table in database. In the update or
     * insert method, all data will be normalized (trim space) before
     * update/insert into database The method wil throw an object of
     * <code>java.lang.Exception</code> class if there is any error occurring
     * when finding, inserting, or updating data
     * <p>
     * Bugs: Still have some issues related to search staff by address
     *
     * @author Nguyen Duc Cuong
     */
    //register 
    public int createUser(User user) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        String sql = "INSERT INTO dbo.[User] VALUES(?,?,?,?,?,?,?,?)";
        //insert in sql
        try {
            conn = getConnection();
            stm = conn.prepareStatement(sql);
            stm = conn.prepareCall(sql);
            int index = 0;//index = 0
            stm.setString(++index, user.getRoleID());//++index = 1
            stm.setString(++index, user.getEmail());//++index = 2
            stm.setString(++index, user.getPassword());//++index = 3
            stm.setString(++index, user.getGender());//++index = 4
            stm.setString(++index, user.getFullname());//++index = 5
            stm.setString(++index, user.getPhone());//++index = 6
            stm.setString(++index, user.getStatus());//++index = 7
            stm.setString(++index, user.getImage());
            return stm.executeUpdate();
        } catch (SQLException e) {

        } finally {

            closeStatement(stm);
            closeConnection(conn);
        }
        return -1;
    }

    @Override
    //check mail rigister 
    public int countExistedUser(User user) throws Exception {
        String sql = "SELECT count(*) AS total FROM dbo.[User]"
                + "WHERE email = ?";
        //select in sql
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        int total = -1;//total =1
        try {
            conn = getConnection();
            stm = conn.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, user.getEmail());
            rs = stm.executeQuery();
            if (rs.next()) {//if rs.next = total 
                total = rs.getInt("total");
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);//close
            closeStatement(stm);
            closeConnection(conn);
        }
        return total;
    }

    @Override
    public User getUser(String email, String password) throws Exception {
        String sql = "SELECT * FROM dbo.[User]"
                + "WHERE email = ? AND password = ? AND [enabled] = 'True' ";
        //select into sql
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            stm = conn.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, email);
            stm.setString(++index, password);
            rs = stm.executeQuery();
            if (rs.next()) {
                int userID = rs.getInt(1);
                String roleID = rs.getString("RoleID");   //get string roleid                 
                String uEmail = rs.getString("Email");//get string Email
                String upass = rs.getString("password");//get string password
                String gender = rs.getString("Gender");//get string Gender
                String fullname = rs.getString("Fullname");//get string
                String phone = rs.getString("Phone");//get string Fullname
                String status = rs.getString("status");//get string status
                String image = rs.getString("image");//get string image
                User user = new User(userID, roleID, uEmail, upass, gender, fullname, phone, status, image);
                //new user  ( userID, roleID, uEmail, upass, gender, fullname, phone, status,image)
                return user;
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closeStatement(stm);
            closeConnection(conn);
        }
        return null;
    }

    @Override
    public List<UserDto> getUserByCondition(String roleId, String gender, String status, int pageSize, int pageNum) throws Exception {
        StringValidation svl = new StringValidation();
        String sql = " select * from"//select from 
                + "(SELECT ROW_NUMBER() OVER(ORDER BY UserID) \n"//subquery select all 
                + "as RowNum,* \n"//index =1 -> ? end.
                + "FROM [SWP].[dbo].[User] "//select from user
                + "where 1=1 ";//  true 
        if (!svl.isNullOrEmpty(roleId)) {
            sql += "AND roleID = ? \t";//not null or not emty
        }
        if (!svl.isNullOrEmpty(gender)) {
            sql += "AND gender = ? \t";//not null or not emty
        }
        if (!svl.isNullOrEmpty(status)) {
            sql += "AND status = ?  \t";//not null or not emty
        }
        sql += " ) AS T WHERE T.RowNum > ?\n"//within
                + "  AND T.RowNum <= ?\n";
        sql += "ORDER BY T.RowNum ";

        List<UserDto> data = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            stm = conn.prepareStatement(sql);
            int index = 0;
            if (!svl.isNullOrEmpty(roleId)) {
                stm.setString(++index, roleId);
            }
            if (!svl.isNullOrEmpty(gender)) {
                stm.setString(++index, gender);
            }
            if (!svl.isNullOrEmpty(status)) {
                stm.setString(++index, status);
            }
            stm.setInt(++index, pageSize * (pageNum - 1));
            stm.setInt(++index, pageSize * (pageNum));
            log.info(roleId);
            log.info(gender);
            log.info(status);
            log.info(sql);
            rs = stm.executeQuery();

            RoleDaoImpl roleDao = new RoleDaoImpl();
            while (rs.next()) {

                UserDto user = new UserDto();
                user.setUserID(rs.getInt("UserID"));
                user.setRole(roleDao.findById(rs.getString("RoleID")).getRoleName());
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getString("Gender"));
                user.setFullname(rs.getString("Fullname"));
                user.setPhone(rs.getString("Phone"));
                user.setStatus("status");
                data.add(user);
            }
            System.out.println(data);
            return data;
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closeStatement(stm);
            closeConnection(conn);
        }
    }

    @Override
    public int countUserWithCondition(String roleId, String gender, String status) throws Exception {
        StringValidation svl = new StringValidation();
        String sql = "SELECT COUNT(*) AS TOTAL\t"//paging
                + "FROM [dbo].[User]\t"
                + "WHERE 1 = 1\t";
        if (!svl.isNullOrEmpty(roleId)) {
            sql += "AND roleID = ? \t"; 
        }
        if (!svl.isNullOrEmpty(gender)) {
            sql += "AND gender = ? \t";
        }
        if (!svl.isNullOrEmpty(status)) {
            sql += "AND status = ? \t";
        }
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        int total = -1;
        try {
            conn = getConnection();
            stm = conn.prepareStatement(sql);
            int index = 0;
            if (!svl.isNullOrEmpty(roleId)) {
                stm.setString(++index, roleId);
            }
            if (!svl.isNullOrEmpty(gender)) {
                stm.setString(++index, gender);
            }
            if (!svl.isNullOrEmpty(status)) {
                stm.setString(++index, status);
            }
            log.info(sql);
            rs = stm.executeQuery();
            if (rs.next()) {
                total = rs.getInt("TOTAL");
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closeConnection(conn);
            closeStatement(stm);

        }
        return total;
    }

    //@Override
    @Override
    public void changePassword(String UserID, String Password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User checkLogin(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkAccountExist(String Email) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetPassword(String email) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void signUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUserByEmail(String email) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changName() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        try {
            System.out.println(new UserDAOImpl().countUserWithCondition("01", "Male", null));
        } catch (Exception ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
