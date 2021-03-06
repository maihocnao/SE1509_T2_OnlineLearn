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
package dao;

import bean.Subject;
import java.util.ArrayList;

/**
 *
 * @author Viettech88.vn
 */
public interface SubjectDAO {
    
     /**
     * Get a User according to email
     *
     * @param sID
     * @return an arraylist of subject
     * @throws Exception
     */
    
     public Subject subjectBySubjectID(String sID) throws Exception;
     public ArrayList<Subject> listAllSubject()  throws Exception;
     public ArrayList<Subject> get6ToHp() throws Exception;
     public ArrayList<Subject> getSubjectBySubjectID(String sID) throws Exception;
     public ArrayList<Subject> getSubjectOfUser( int uID) throws Exception;
     public void editSubject(String subjectid, int categoryid, String thumbnail, String name, String description, String status, String featured);
     public void addSubject(String subjectid, int categoryid, String thumbnail, String name, String description, String status, String featured);   
     int countTotalSubjectSearch(int status) throws Exception;
     List<Subject> search(int status, int pageIndex, int pageSize) throws Exception;
     
}
