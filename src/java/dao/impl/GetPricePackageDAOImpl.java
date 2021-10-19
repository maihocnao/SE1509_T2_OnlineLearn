/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import context.DBContext;
import bean.PricePackage;
import dao.PricePackageDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Viettech88.vn
 */
public class GetPricePackageDAOImpl extends DBContext implements PricePackageDAO{

    @Override
    public ArrayList<PricePackage> getPPbySubjectID(String subjectID) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        ArrayList<PricePackage> arr = new ArrayList<>();
        String sql = "SELECT * FROM [SWP].[dbo].[PricePackage] where subjectID = ?";
     //   int subjectID, int categoryID, String thumbnail, String name, String Description
        try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, subjectID);
            rs = statement.executeQuery();
            while(rs.next()) {
               int pricePackageID = rs.getInt(1);
               String PPname = rs.getString(2);
                int accessDuration = rs.getInt(3); 
                String status = rs.getString(4);
                float listPrice= rs.getFloat(5);
                float salePrice= rs.getFloat(6);
                String description = rs.getString(4);    
                String sID = rs.getString(4);
                PricePackage pp = new PricePackage(pricePackageID, PPname, accessDuration, status, listPrice, salePrice, description, subjectID);
                arr.add(pp);
                
            }
        } catch (SQLException ex) {          
        }finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        System.out.println(arr);
        return arr;
    }
    
}
