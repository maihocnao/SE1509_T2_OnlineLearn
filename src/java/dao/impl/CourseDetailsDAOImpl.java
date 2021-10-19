/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import dao.SubjectDAO;
import context.DBContext;
import java.util.ArrayList;
import bean.Subject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viettech88.vn
 */
public class CourseDetailsDAOImpl extends DBContext implements SubjectDAO{

    @Override
    public ArrayList<Subject> listAllSubject() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Subject subjectBySubjectID(String sID) throws Exception{
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        Subject s = null;
        String sql = "SELECT *  FROM [SWP].[dbo].[Subject] where subjectID=?";
          try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, sID);
            rs = statement.executeQuery();
            while (rs.next()) {
                String subjectID = rs.getString(1);
                int categoryID=rs.getInt(2);
                String thumbnail=rs.getString(3);               
                String name=rs.getString(4);
                String des = rs.getString(5);
                String status = rs.getString(6);
                String ft = rs.getString(7);
                s = new Subject(subjectID, categoryID, thumbnail, name, des, status, ft);
                System.out.println(s);
            }
            return s;
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
    }
       public static void main(String[] args) {
        CourseDetailsDAOImpl a = new CourseDetailsDAOImpl();
        try {
            a.subjectBySubjectID("ASSL");
        } catch (Exception ex) {
            Logger.getLogger(CourseDetailsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Subject> get6ToHp() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public ArrayList<Subject> getSubjectBySubjectID(String sID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
       
    
}
