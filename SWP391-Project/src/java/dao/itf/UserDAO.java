/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.itf;

/**
 *
 * @author Viettech88.vn
 */
public interface UserDAO {
    public User checkLogin(String email, String password);
    boolean checkAccountExist();
    void changePassword(String UserID, String Password);
    void changName();
    void resetPassword();
}
