/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.itf;

import java.sql.SQLException;
import bean.User;

/**
 *
 * @author Viettech88.vn
 */
public interface UserDAO {

    boolean checkAccountExist();

    void changePassword();

    void changName();

    void resetPassword();

    int createUser(User user);

    int countExistedUser(User user);
}
