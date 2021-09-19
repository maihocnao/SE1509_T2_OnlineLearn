/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Phong
 */
public class User {
    int UserID;
    int SettingID;
    String RoleID;
    String Email;
    String Password;
    String Gender;
    String Fullname;
    String Phone;

    public User() {
    }

    public User(int UserID, int SettingID, String RoleID, String Email, String Password, String Gender, String Fullname, String Phone) {
        this.UserID = UserID;
        this.SettingID = SettingID;
        this.RoleID = RoleID;
        this.Email = Email;
        this.Password = Password;
        this.Gender = Gender;
        this.Fullname = Fullname;
        this.Phone = Phone;
    }

    public int getUserID() {
        return UserID;
    }

    public int getSettingID() {
        return SettingID;
    }

    public String getRoleID() {
        return RoleID;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getGender() {
        return Gender;
    }

    public String getFullname() {
        return Fullname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public void setSettingID(int SettingID) {
        this.SettingID = SettingID;
    }

    public void setRoleID(String RoleID) {
        this.RoleID = RoleID;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return "User{" + "UserID=" + UserID + ", SettingID=" + SettingID + ", RoleID=" + RoleID + ", Email=" + Email + ", Password=" + Password + ", Gender=" + Gender + ", Fullname=" + Fullname + ", Phone=" + Phone + '}';
    }
    
    
}
