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
    String regisTime;
    String status;
    String validFrom;
    String validto;
    float totalPrice;
    int UserID;
    String UserEmail;
    String subjectID;
    int pricePackageID;
    public Registration() {
    }

    public Registration(int registrationID, String regisTime, String status, String validFrom, String validto, float totalPrice, int UserID, String UserEmail, String subjectID, int pricePackageID) {
        this.registrationID = registrationID;
        this.regisTime = regisTime;
        this.status = status;
        this.validFrom = validFrom;
        this.validto = validto;
        this.totalPrice = totalPrice;
        this.UserID = UserID;
        this.UserEmail = UserEmail;
        this.subjectID = subjectID;
        this.pricePackageID = pricePackageID;
    }

    

   

    public int getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(int registrationID) {
        this.registrationID = registrationID;
    }

    public String getRegisTime() {
        return regisTime;
    }

    public void setRegisTime(String regisTime) {
        this.regisTime = regisTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidto() {
        return validto;
    }

    public void setValidto(String validto) {
        this.validto = validto;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public int getPricePackageID() {
        return pricePackageID;
    }

    public void setPricePackageID(int pricePackageID) {
        this.pricePackageID = pricePackageID;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Registration{" + "registrationID=" + registrationID + ", regisTime=" + regisTime + ", status=" + status + ", validFrom=" + validFrom + ", validto=" + validto + ", totalPrice=" + totalPrice + ", UserID=" + UserID + ", UserEmail=" + UserEmail + ", subjectID=" + subjectID + ", pricePackageID=" + pricePackageID + '}';
    }
    


   

    
    
}
