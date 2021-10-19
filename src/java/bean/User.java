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
    String RoleID;
    String Email;
    String Password;
    String Gender;
    String Fullname;
    String Phone;
    String status;
    String image;
    
    public User() {
    }

    public User(int UserID, String RoleID, String Email, String Password, String Gender, String Fullname, String Phone, String status, String image) {
        this.UserID = UserID;
        this.RoleID = RoleID;
        this.Email = Email;
        this.Password = Password;
        this.Gender = Gender;
        this.Fullname = Fullname;
        this.Phone = Phone;
        this.status = status;
        this.image = image;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getRoleID() {
        return RoleID;
    }

    public void setRoleID(String RoleID) {
        this.RoleID = RoleID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
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
        return "User{" + "UserID=" + UserID + ", RoleID=" + RoleID + ", Email=" + Email + ", Password=" + Password + ", Gender=" + Gender + ", Fullname=" + Fullname + ", Phone=" + Phone + ", status=" + status + ", image=" + image + '}';
    }
    
    
    

   
    
    
}
