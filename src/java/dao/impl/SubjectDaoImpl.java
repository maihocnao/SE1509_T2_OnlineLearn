/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Category;
import bean.Subject;
import dao.BaseDao;
import dao.SubjectDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyv2098
 */
public class SubjectDaoImpl extends BaseDao implements SubjectDAO {

    @Override
    public Subject subjectBySubjectID(String sID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Subject> listAllSubject() throws Exception {
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
    public boolean checkExist(String id) {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String sql = "SELECT COUNT(*) as total FROM [dbo].[Subject]"
                    + " WHERE subjectID = ?";
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                int total = rs.getInt("total");
                System.out.println("total = " + total);
                return total >= 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public int insertOne(Subject subject) {
        try {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            String sql = "INSERT INTO [dbo].[Subject] (subjectID, categoryID, thumbnail, name, Description, "
                    + "status, featured, owner)\n"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            Connection con = getConnection();
            PreparedStatement stm = con.prepareStatement(sql);
            int index = 0;
            stm.setString(++index, subject.getSubjectID());
            stm.setInt(++index, subject.getCategoryID());
            stm.setString(++index, subject.getThumbnail());
            stm.setString(++index, subject.getName());
            stm.setString(++index, subject.getDescription());
            stm.setString(++index, subject.getStatus());
            stm.setString(++index, subject.getFeatured());
            stm.setString(++index, subject.getOwner());
            return stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SubjectDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
