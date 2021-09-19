/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Registration;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Viettech88.vn
 */
public interface RegistrationDAOitf {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public RegistrationDAOitf() {
    }

    private void closeConnection() throws SQLException {
        if (con != null) {
            con.close();
        }
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
    }

    public boolean createNewRegistration(Registration registration) throws SQLException {
       
    }

    public float getTotalByUserID(int userID) throws SQLException {
        
    }

    public boolean updateTotal(int userID, float total) throws Exception {
        
    }

    public int returnRegisID(int userID) throws SQLException {
        
    }

    public boolean checkDuplicate(int regisID, int subID) throws SQLException {
        
    }

    public Registration getRegistration(int regisID) throws SQLException {
        
    }

    public Registration getFullRegistration(int regisID) throws SQLException {
        
    }

    public boolean updateStatus(int regisID, int status) throws SQLException {
        
    }

    public boolean updateStatus(int userID) throws SQLException {
        
    }

    public List<Registration> getAllRegistration() throws SQLException {
        
    }

    public List<Registration> getRegistrationByUID() throws SQLException {
        
    }

    public List<Registration> getRegistrationByEmail() throws SQLException {
        
    }

    public List<Registration> getRegistrationByRegistrationTime() throws SQLException {
        
    }

    public List<Registration> getRegistrationByStatus() throws SQLException {
        
    }

    public boolean updateValidTo(int regisID, Date newValidTo) throws SQLException {
        
    }

    public List<Registration> getSearchList(String txtSearch) throws SQLException {
        
    }

    public ArrayList<Registration> getAllRegis(int sts) throws Exception {
        
    }

    public ArrayList<Registration> getAllRegisBaseSubject(int subjectID) throws Exception {
        
    }

    public ArrayList<Registration> getAllRegisBaseUser(int userID) throws Exception {
        
    }
}
