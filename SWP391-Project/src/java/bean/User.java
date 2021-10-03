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
    String roleID;
    String email;
    String password;
    String gender;
    String fullname;
    String phone;
    String status;
    String image;

    public User() {
    }

    public User(int UserID, String RoleID, String Email, String Password, String Gender, String Fullname, String Phone, String status, String image) {
        this.UserID = UserID;
        this.roleID = RoleID;
        this.email = Email;
        this.password = Password;
        this.gender = Gender;
        this.fullname = Fullname;
        this.phone = Phone;
        this.status = status;
        this.image = image;
    }

    public User(String Fullname, String Gender, String Email, String Phone) {
        this.fullname = Fullname;
        this.gender = Gender;
        this.email = Email;
        this.phone = Phone;

    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String RoleID) {
        this.roleID = RoleID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "User{" + "UserID=" + UserID + ", roleID=" + roleID + ", email=" + email + ", password=" + password + ", gender=" + gender + ", fullname=" + fullname + ", phone=" + phone + ", status=" + status + ", image=" + image + '}';
    }

    

}
