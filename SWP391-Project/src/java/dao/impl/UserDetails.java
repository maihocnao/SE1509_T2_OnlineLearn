/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        TEAM 2          First Version<br>
 */
package dao.impl;

import bean.User;
import dao.MyDAO;
import dao.itf.UserDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class UserDetails extends MyDAO implements UserDAO {

    public User getUserByEmail(String email) {
        User user = new User();
        String sql = "select * from [user] where email=?";
        try {
            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setString(1, email);
                rs = ps.executeQuery();
                if (rs.next()) {
                    user.setUserID(rs.getInt(1));
                    user.setRoleID(rs.getString(2));
                    user.setEmail(rs.getString(3));
                    user.setPassword(rs.getString(4));
                    user.setGender(rs.getString(5));
                    user.setFullname(rs.getString(6));
                    user.setPhone(rs.getString(7));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public ArrayList<User> getAllUsers() {
        String sql = "select * from [user]";
        ArrayList<User> lst = new ArrayList<>();
        try {
            User user = new User();
            if (con != null) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    user.setUserID(rs.getInt(1));
                    user.setRoleID(rs.getString(2));
                    user.setEmail(rs.getString(3));
                    user.setPassword(rs.getString(4));
                    user.setGender(rs.getString(5));
                    user.setFullname(rs.getString(6));
                    user.setPhone(rs.getString(7));

                    lst.add(user);
                }
            }
        } catch (Exception e) {

        }
        return lst;
    }

    public User getUserbyID(int id) {
        String sql = "select * from [user] where userID=?";
        User user = new User();
        try {

            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                if (rs.next()) {
                    user.setUserID(rs.getInt(1));
                    user.setRoleID(rs.getString(2));
                    user.setEmail(rs.getString(3));
                    user.setPassword(rs.getString(4));
                    user.setGender(rs.getString(5));
                    user.setFullname(rs.getString(6));
                    user.setPhone(rs.getString(7));

                }
            }
        } catch (Exception e) {

        }
        return user;
    }

    public ArrayList<User> getAllUserbyName(String name) {
        String sql = "select * from [user] where fullname like ?";
        ArrayList<User> lst = new ArrayList<>();
        try {
            User user = new User();
            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setString(1, "%" + name + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                    user.setUserID(rs.getInt(1));
                    user.setRoleID(rs.getString(2));
                    user.setEmail(rs.getString(3));
                    user.setPassword(rs.getString(4));
                    user.setGender(rs.getString(5));
                    user.setFullname(rs.getString(6));
                    user.setPhone(rs.getString(7));

                    lst.add(user);
                }
            }
        } catch (Exception e) {
        }

        return lst;
    }

    public ArrayList<User> getAllUserbyEmail(String semail) throws Exception {
        String sql = "select * from [user] where email like ?";
        ArrayList<User> lst = new ArrayList<>();
        User user = new User();
        try {
            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setString(1, "%" + semail + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                    user.setUserID(rs.getInt(1));
                    user.setRoleID(rs.getString(2));
                    user.setEmail(rs.getString(3));
                    user.setPassword(rs.getString(4));
                    user.setGender(rs.getString(5));
                    user.setFullname(rs.getString(6));
                    user.setPhone(rs.getString(7));


                    lst.add(user);
                }
            }

        } catch (Exception e) {

        }
        return lst;
    }

    public ArrayList<User> getAllUserbyPhone(String sphone) throws Exception {
        String sql = "select * from [user] where phone like ?";
        ArrayList<User> lst = new ArrayList<>();
        User user = new User();
        try {

            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setString(1, "%" + sphone + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                  user.setUserID(rs.getInt(1));
                    user.setRoleID(rs.getString(2));
                    user.setEmail(rs.getString(3));
                    user.setPassword(rs.getString(4));
                    user.setGender(rs.getString(5));
                    user.setFullname(rs.getString(6));
                    user.setPhone(rs.getString(7));

                    lst.add(user);
                }
            }
        } catch (Exception e) {

        }
        return lst;
    }

    public ArrayList<User> getAllUserbyGender(String fgender) throws Exception {
        String sql = "select * from {user] where gender like ?";
        ArrayList<User> lst = new ArrayList<>();
        User user = new User();
        try {

            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setString(1, "%" + fgender + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                    user.setUserID(rs.getInt(1));
                    user.setRoleID(rs.getString(2));
                    user.setEmail(rs.getString(3));
                    user.setPassword(rs.getString(4));
                    user.setGender(rs.getString(5));
                    user.setFullname(rs.getString(6));
                    user.setPhone(rs.getString(7));


                    lst.add(user);
                }
            }

        } catch (Exception e) {

        }
        return lst;
    }

    public ArrayList<User> getAllUserbyRole(String frole) throws Exception {
        String sql = "select * from {user} where roleID like ?";
        ArrayList<User> lst = new ArrayList<>();
        User user = new User();
        try {

            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setString(1, "%" + frole + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                   user.setUserID(rs.getInt(1));
                    user.setRoleID(rs.getString(2));
                    user.setEmail(rs.getString(3));
                    user.setPassword(rs.getString(4));
                    user.setGender(rs.getString(5));
                    user.setFullname(rs.getString(6));
                    user.setPhone(rs.getString(7));

                    lst.add(user);
                }
            }
        } catch (Exception e) {

        }
        return lst;
    }

    @Override
    public User checkLogin(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkAccountExist(String Email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetPassword(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User getUser(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changePassword(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void signUp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        UserDetails ud = new UserDetails();
//        System.out.println(ud.getUserByEmail("ltCustomer@2mail.com"));
//        System.out.println(ud.getAllUsers());
//        System.out.println(ud.getUserbyID(1));
        System.out.println(ud.getAllUserbyName("thi"));
        
    }
}
