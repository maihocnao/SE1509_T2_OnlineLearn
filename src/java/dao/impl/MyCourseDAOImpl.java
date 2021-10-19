/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.*;
import dao.*;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viettech88.vn
 */
public class MyCourseDAOImpl extends DBContext implements SubjectDAO{

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public ArrayList<Subject> listAllSubject() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Subject> get6ToHp() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    //@Override
    public ArrayList<Subject> getSubjectOfUser( int uID) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        ArrayList<Subject> arr = new ArrayList<>();
        String sql = "SELECT *FROM [SWP].[dbo].[Subject] where subjectID=?";
        GetSubjectIDFromRegis subjectIdGet= new GetSubjectIDFromRegis();
        ArrayList<Registration>  arrRegis = subjectIdGet.getSubjectIDfromUserRegistration(uID);
        for(Registration r:arrRegis){
             try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, r.getSubjectID());
            rs = statement.executeQuery();
            while(rs.next()) {
               
                 String subjectID = rs.getString(1);
                int categoryID=rs.getInt(2);
                String thumbnail=rs.getString(3);               
                String name=rs.getString(4);
                String des = rs.getString(5);
                String status = rs.getString(6);
                String ft = rs.getString(7);
                Subject subject = new Subject(subjectID, categoryID, thumbnail, name, des, status, ft);               
                arr.add(subject);
            }
        } catch (SQLException ex) {  
            throw  ex;
        }finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        }
        
        
     //   int subjectID, int categoryID, String thumbnail, String name, String Description
       
        System.out.println(arr);
        return arr;
    }
    public static void main(String[] args) {
        MyCourseDAOImpl a= new MyCourseDAOImpl();
        try {
            a.getSubjectOfUser(1);
        } catch (Exception ex) {
            Logger.getLogger(MyCourseDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Subject> getSubjectBySubjectID(String sID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Subject subjectBySubjectID(String sID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
