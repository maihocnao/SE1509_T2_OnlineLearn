/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        TEAM 2          First Version<br>
 */
package dao;

import bean.User;
import bean.UserDto;
import java.util.List;

public interface UserDAO {
    /**
 * This class contains methods to help us manipulate User objects in the
 * database.
 *
 * @author AllMember
 */
    public User checkLogin(String email, String password)  throws Exception;
    public boolean checkAccountExist(String email)  throws Exception;
 
    public void changName()  throws Exception;
    public void resetPassword(String email)  throws Exception;
  //   public User getUser(String email, String password)  throws Exception;
    public void changePassword(String email, String password)  throws Exception;
    public void signUp();
    public int createUser(User user) throws Exception;
    public int countExistedUser(User user) throws Exception;
    public User getUser(String email, String password) throws Exception;
    public List<UserDto> getUserByCondition(String roleId, String gender, String status, int pageSize, int pageNum) throws Exception;
    public int countUserWithCondition(String roleId, String gender, String status) throws Exception;
     
   /**
     * Get all User 
     *
     * @param email. It is an int number.
     * @param  It is an int number.
     * @return a list <code>Gallery</code> object
     * @throws Exception
     */
    public User getUserByEmail(String email) throws Exception;
}
