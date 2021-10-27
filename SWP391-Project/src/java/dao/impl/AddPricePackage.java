/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-20    1.0        Quan           First Version<br>
 */
package dao.impl;

import bean.PricePackage;
import dao.MyDAO;
import dao.PricePackageDAO;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class AddPricePackage extends MyDAO implements PricePackageDAO{

    @Override
    public ArrayList<PricePackage> getPPbySubjectID(String subjectID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPricePackage(String name, int accessduration, String status, float listprice, float saleprice, String description, String subjectid) {
        String sql = "insert into PricePackage values (?,?,?,?,?,?,?)";
        try {
            if(con!=null){
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setInt(2, accessduration);
                ps.setString(3, status);
                ps.setFloat(4, listprice);
                ps.setFloat(5, listprice);
                ps.setString(6, description);
                ps.setString(7, subjectid);
                ps.executeUpdate();
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void editPricePackage(int pricepackageid, String name, int accessduration, String status, float listprice, float saleprice, String description, String subjectid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePricePackage(int pricepackageid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PricePackage getPPbyId(int pricepackageid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
