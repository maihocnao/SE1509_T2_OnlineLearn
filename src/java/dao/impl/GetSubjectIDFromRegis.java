/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;
import bean.Registration;
import dao.RegistrationDAO;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viettech88.vn
 */
public class GetSubjectIDFromRegis extends DBContext implements RegistrationDAO{

   
    public static void main(String[] args) {
        GetSubjectIDFromRegis a = new GetSubjectIDFromRegis();
        try {
            a.getSubjectIDfromUserRegistration(1);
        } catch (Exception ex) {
            Logger.getLogger(GetSubjectIDFromRegis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Registration> getSubjectIDfromUserRegistration(int userID) throws Exception {
       
         Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        ArrayList<Registration> arr = new ArrayList<>();
        String sql = "  select * from [SWP].[dbo].[Registration] where UserID=?";
     //   int subjectID, int categoryID, String thumbnail, String name, String Description
        try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, userID);
            rs = statement.executeQuery();
            while(rs.next()) {
               
              int registrationID = rs.getInt(1);
                String regisTime = rs.getString(2)  ;
                String status  = rs.getString(3);
                String validFrom = rs.getString(4) ;
                String validto = rs.getString(5) ;
                 float totalPrice = rs.getFloat(6);
                int UserID = rs.getInt(7);
                String UserEmail = rs.getString(8) ;
                String subjectID = rs.getString(9) ;
                int pricePackageID = rs.getInt(10);
                Registration regis = new Registration(registrationID, regisTime, status, validFrom, validto, totalPrice, UserID, UserEmail, subjectID, pricePackageID);
                arr.add(regis);
            }
           // System.out.println(arr);
        return arr;
        } catch (ClassNotFoundException | SQLException ex) {    
            throw ex;
        }finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }

    
    }
    
    
}
