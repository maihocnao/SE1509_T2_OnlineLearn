/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    PricePackage getOneById(int id);
    int insert(PricePackage data);
}
