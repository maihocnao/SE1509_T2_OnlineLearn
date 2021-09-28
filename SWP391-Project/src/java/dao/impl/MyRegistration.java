/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Registration;
import dao.DBConnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class MyRegistration {
    Connection conn = null;
    DBConnect dbConn=null;
    PreparedStatement ps= null;
    ResultSet rs = null;
    
    public MyRegistration(){
    
    }
    public MyRegistration(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbConn=dbconn;
         
    }
    public List<Registration> getRegisByEmail(String email) {
        List<Registration> rlist = new ArrayList<>();
        String xSql = "select * from Registration where UserEmail = ?";
        int registrationid, status, userid;
        String registime,validfrom, validto, useremail,subjectid;
        try {
            ps = conn.prepareStatement(xSql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while(rs.next()){
                registrationid = rs.getInt("registrationID");
                registime = rs.getString("regisTime");
                status = rs.getInt("status");
                validfrom = rs.getString("validFrom");
                validto = rs.getString("validto");
                userid = rs.getInt("UserID");
                useremail = rs.getString("UserEmail");
                subjectid = rs.getString("SubjectID");
                Registration r = new Registration(registrationid, registime, status, validfrom, validto, userid, useremail, subjectid);
                rlist.add(r);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
        }
        return rlist;
    }
}
