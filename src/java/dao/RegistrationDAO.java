/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import bean.Registration;


/**
 *
 * @author Viettech88.vn
 */
public interface RegistrationDAO {
    ArrayList<Registration> getSubjectIDfromUserRegistration(int userID) throws Exception;
    
}
