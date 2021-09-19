/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Date;

/**
 *
 * @author Phong
 */
public class Registration {
    int registrationID;
    int status;
    int UserID;
    Date regisTime;
    String validFrom;
    String validto;
    String UserEmail;

    public Registration() {
    }

    public Registration(int registrationID, int status, int UserID, Date regisTime, String validFrom, String validto, String UserEmail) {
        this.registrationID = registrationID;
        this.status = status;
        this.UserID = UserID;
        this.regisTime = regisTime;
        this.validFrom = validFrom;
        this.validto = validto;
        this.UserEmail = UserEmail;
    }

    public int getRegistrationID() {
        return registrationID;
    }

    public int getStatus() {
        return status;
    }

    public int getUserID() {
        return UserID;
    }

    public Date getRegisTime() {
        return regisTime;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public String getValidto() {
        return validto;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setRegistrationID(int registrationID) {
        this.registrationID = registrationID;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public void setRegisTime(Date regisTime) {
        this.regisTime = regisTime;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidto(String validto) {
        this.validto = validto;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }
    
    
}
