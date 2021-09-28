/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.itf;

import bean.Registration;
import java.util.List;

/**
 *
 * @author Viettech88.vn
 */
public interface RegistrationDAO {
    public List<Registration> getAllRegis();
    public List<Registration> getRegisByEmail(String email);
}
