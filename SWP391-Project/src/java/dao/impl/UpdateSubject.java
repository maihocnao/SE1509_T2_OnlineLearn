/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-30    1.0        Mai           First Version<br>
 * 2021-10-15    1.1        Quan          Second Version<br>
 */
package dao.impl;

import bean.Subject;
import dao.MyDAO;
import dao.SubjectDAO;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class UpdateSubject extends MyDAO implements SubjectDAO{

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
    public ArrayList<Subject> getSubjectOfUser(int uID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editSubject(String subjectid, int categoryid, String thumbnail, String name, String description, String status, String featured) {
        String sql = "update [Subject] set categoryID = ?, thumbnail = ?, name = ?, Description = ?, status = ?, featured = ? where subjectID = ?";
        try {
            if(con!=null){
                ps = con.prepareStatement(sql);
                ps.setInt(1,categoryid);
                ps.setString(2, thumbnail);
                ps.setString(3, name);
                ps.setString(4, description);
                ps.setString(5, status);
                ps.setString(6, featured);
                ps.setString(7, subjectid);
                ps.executeUpdate();
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void addSubject(String subjectid, int categoryid, String thumbnail, String name, String description, String status, String featured) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
