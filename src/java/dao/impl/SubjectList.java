/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Subject;
import context.DBContext;
import dao.SubjectDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SubjectList extends DBContext implements SubjectDAO{

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public ArrayList<Subject> listAllSubject() throws Exception{
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "Select * from [subject]";
        ArrayList<Subject> allsubject = new ArrayList<>();
        try {
                conn = getConnection();
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    // query information in db
                     String subjectID = rs.getString(1);
                int categoryID=rs.getInt(2);
                String thumbnail=rs.getString(3);               
                String name=rs.getString(4);
                String des = rs.getString(5);
                String status = rs.getString(6);
                String ft = rs.getString(7);
                Subject subject = new Subject(subjectID, categoryID, thumbnail, name, des, status, ft);
               
                   allsubject.add(subject);
                
            }
                return allsubject;
        } catch (SQLException ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConnection(conn);
        }
        
}

    public static void main(String[] args) throws Exception {
        SubjectList sj = new SubjectList();
        System.out.println(sj.listAllSubject());
    }

    @Override
    public Subject subjectBySubjectID(String sID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Subject> get6ToHp() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Subject> getSubjectBySubjectID(String sID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertOne(Subject subject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkExist(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
