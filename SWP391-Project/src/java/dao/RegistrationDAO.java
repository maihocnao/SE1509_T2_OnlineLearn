/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-30    1.0        Mai           First Version<br>
 */
package dao;

import bean.New;
import java.util.ArrayList;
import bean.Registration;


/**
 *
 * @author Viettech88.vn
 */
public interface RegistrationDAO {
    ArrayList<Registration> getSubjectIDfromUserRegistration(int userID) throws Exception;
    int getCountTotalRegistration() throws Exception ;
    public New GetDetailFromRegistration(int registrationID) throws Exception;
    public ArrayList<Registration> getAllRegis() throws Exception;
    public int countRegis() throws Exception;
    public ArrayList<Registration> getRegisByPaging(int pageNumber, int rows) throws Exception;
    List<RegistrationStatistic> search( int status, int pageIndex, int pageSize) throws Exception ;
    int countTotalRegistrationSearch(int status) throws Exception;
    void addRegistration(int userid,String useremail, String subjectid, int pricepackageid);
}
