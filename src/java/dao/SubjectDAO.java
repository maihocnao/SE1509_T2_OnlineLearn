/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Category;
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

    public ArrayList<Subject> listAllSubject() throws Exception;

    public ArrayList<Subject> get6ToHp() throws Exception;

    public ArrayList<Subject> getSubjectBySubjectID(String sID) throws Exception;

    int insertOne(Subject subject);
    boolean checkExist(String id);
}
