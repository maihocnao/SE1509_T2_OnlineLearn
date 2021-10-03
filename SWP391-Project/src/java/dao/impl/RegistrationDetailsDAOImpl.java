/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.New;
import bean.PricePackage;
import bean.Registration;
import bean.Subject;
import bean.User;
import context.DBContext;
import dao.RegistrationDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phong
 */
public class RegistrationDetailsDAOImpl extends DBContext implements RegistrationDAO {

    public static void main(String[] args) {
        RegistrationDetailsDAOImpl a = new RegistrationDetailsDAOImpl();
        try {
            a.GetDetailFromRegistration(1);
            System.out.println(a.GetDetailFromRegistration(1));
        } catch (Exception ex) {
            Logger.getLogger(RegistrationDetailsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public New GetDetailFromRegistration(int registrationID) throws Exception {

        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        New s = null ;
        String sql = "  SELECT  Subject.name,\n"
                + "                		PricePackage.listPrice,PricePackage.salePrice,\n"
                + "                 		[User].Fullname,[User].Gender,[User].Email,[User].Phone,\n"
                + "                 	Registration.regisTime,Registration.status,Registration.validFrom,Registration.validto\n"
                + "                		\n"
                + "                 FROM Registration\n"
                + "                 INNER JOIN Subject ON  Registration.subjectID = Subject.subjectID\n"
                + "                 INNER JOIN PricePackage ON  Registration.pricepackageID = PricePackage.pricePackageID \n"
                + "                 INNER JOIN [User] ON  Registration.UserID = [User].UserID where registrationID= ? ";
        
        
          try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, registrationID);
            rs = statement.executeQuery();
            if (rs.next()) {
                String subjectname = rs.getString("name");
                float listPrice = rs.getFloat("listPrice");
                float salePrice = rs.getFloat("salePrice");
                String fullname = rs.getString("Fullname");
                String gender = rs.getString("Gender");
                String email = rs.getString("Email");
                String phone = rs.getString("Phone");
                String regisTime = rs.getString("regisTime");
                String status = rs.getString("status");
                String validFrom = rs.getString("validFrom");
                String validto = rs.getString("validto");
                Subject subject = new Subject(subjectname); 
                PricePackage pricePackage = new PricePackage(listPrice, salePrice); 
                User user = new User(fullname, gender, email, phone); 
                Registration registration = new Registration(regisTime, status, validFrom, validto); 
                
                s = new New(subject, pricePackage, user, registration);
                System.out.println(s);
            }
            return s;
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }

    }

    @Override
    public ArrayList<Registration> getSubjectIDfromUserRegistration(int userID) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
