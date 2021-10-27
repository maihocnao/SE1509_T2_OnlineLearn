/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-30    1.0        Mai           First Version<br>
 * 2021-10-27    1.1        Quan          Second Version<br>
 */
package dao;
import bean.PricePackage;

import java.util.ArrayList;

/**
 *
 * @author Viettech88.vn
 */
public interface PricePackageDAO {
    ArrayList<PricePackage> getPPbySubjectID(String subjectID) throws Exception;
    public void addPricePackage(String name, int accessduration, String status, float listprice, float saleprice, String description, String subjectid);
    public void editPricePackage(int pricepackageid, String name, int accessduration, String status, float listprice, float saleprice, String description, String subjectid);
    public void deletePricePackage(int pricepackageid);
    PricePackage getPPbyId(int pricepackageid);
}
