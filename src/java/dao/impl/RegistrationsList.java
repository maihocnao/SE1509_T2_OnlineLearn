/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Registration;
import dao.MyDAO;
import dao.RegistrationDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class RegistrationsList extends MyDAO implements RegistrationDAO {

    @Override
    public ArrayList<Registration> getSubjectIDfromUserRegistration(int userID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public ArrayList<Registration> getAllRegistrations() throws Exception{
        ArrayList<Registration> rlist = new ArrayList<>();
        String sql = "select * from Registration";
        try {
            if (con != null) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int registrationid = rs.getInt("registrationID");
                    String regisTime = rs.getString("regisTime");
                    String status = rs.getString("status");
                    String validfrom = rs.getString("validFrom");
                    String validto = rs.getString("validto");
                    float totalprice = rs.getFloat("totalPrice");
                    int userid = rs.getInt("UserID");
                    String useremail = rs.getString("UserEmail");
                    String subjectid = rs.getString("subjectID");
                    int pricepackageid = rs.getInt("pricepackageID");
                    Registration r = new Registration(registrationid, regisTime, status, validfrom, validto, totalprice, userid, useremail, subjectid, pricepackageid);
                    rlist.add(r);
                }
            }
        } catch (Exception ex) {

        }
        return rlist;
    }
    public static void main(String[] args) {
        RegistrationsList a = new RegistrationsList();
         ArrayList<Registration> rlist;
        try {
            rlist = a.getAllRegistrations();  System.out.println(rlist);
        } catch (Exception ex) {
            Logger.getLogger(RegistrationsList.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    //@Override
    public ArrayList<Registration> getMyRegistrations(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
