/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.itf;

import java.sql.SQLException;
import bean.User;
import bean.UserDto;
import java.util.List;

/**
 *
 * @author Viettech88.vn
 */
public interface UserDAO {

    boolean checkAccountExist();

    void changePassword();

    void changName();

    void resetPassword();
    void changePassword(String UserID, String Password);
    int createUser(User user);

    int countExistedUser(User user);

    User getUser(String email, String password);

    List<UserDto> getUserByCondition(String roleId, String gender, String status, int pageSize, int pageNum);

    int countUserWithCondition(String roleId, String gender, String status);

    public User checkLogin(String email, String password);
}
