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
public class AddSubject extends MyDAO implements SubjectDAO{

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addSubject(String subjectid, int categoryid, String thumbnail, String name, String description, String status, String featured) {
        String sql = "insert into [Subject] values (?,?,?,?,?,?,?)";
        try {
            if(con!=null){
                ps = con.prepareStatement(sql);
                ps.setString(1, subjectid);
                ps.setInt(2, categoryid);
                ps.setString(3, thumbnail);
                ps.setString(4, name);
                ps.setString(5, description);
                ps.setString(6, status);
                ps.setString(7, featured);
                ps.executeUpdate();
            }
        } catch (Exception e) {
        }
    }
    
}
