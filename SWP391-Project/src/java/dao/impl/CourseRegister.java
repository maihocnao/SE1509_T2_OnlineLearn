/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.New;
import bean.PricePackage;
import bean.Registration;
import dao.MyDAO;
import dao.RegistrationDAO;
import java.util.ArrayList;

/**
 *
 * @author asus
 */


import dao.MyDAO;
import dao.PricePackageDAO;
import dao.RegistrationDAO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author asus
 */
public class CourseRegister extends MyDAO implements RegistrationDAO{

    @Override
    public ArrayList<Registration> getSubjectIDfromUserRegistration(int userID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public New GetDetailFromRegistration(int registrationID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addRegistration(int userid,String useremail, String subjectid, int pricepackageid) {
        String sql = "insert into Registration values (?,?,?,?,?,?,?,?,?)";
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        GetPPByID gppbi = new GetPPByID();
        PricePackage pp = gppbi.getPPbyId(pricepackageid);
        int duration = pp.getAccessDuration();
        cal.add(Calendar.DAY_OF_MONTH, duration);
        Date due = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String sDate = sdf.format(date);
        String sDue = sdf.format(due);
        float totalprice = pp.getSalePrice();
        String status = "Completed";
        try {
            if(con!=null){
                ps = con.prepareStatement(sql);
                ps.setString(1, sDate);
                ps.setString(2, status);
                ps.setString(3, sDate);
                ps.setString(4, sDue);
                ps.setFloat(5, totalprice);
                ps.setInt(6, userid);
                ps.setString(7, useremail);
                ps.setString(8, subjectid);
                ps.setInt(9, pricepackageid);
                ps.executeUpdate();
            }
        } catch (Exception e) {
        }
    }

    
}
