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
public class PricePackage {
    int pricePackageID;
    String PPname;
    String subjectID;
    int accessDuration; 
    String status;
    float listPrice;
    float salePrice;
    String description; 
    public PricePackage() {
    }

    public PricePackage(int pricePackageID, String PPname, String subjectID, int accessDuration, String status, float listPrice, float salePrice, String description) {
        this.pricePackageID = pricePackageID;
        this.PPname = PPname;
        this.subjectID = subjectID;
        this.accessDuration = accessDuration;
        this.status = status;
        this.listPrice = listPrice;
        this.salePrice = salePrice;
        this.description = description;
    }

    public int getPricePackageID() {
        return pricePackageID;
    }

    public void setPricePackageID(int pricePackageID) {
        this.pricePackageID = pricePackageID;
    }

    public String getPPname() {
        return PPname;
    }

    public void setPPname(String PPname) {
        this.PPname = PPname;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public int getAccessDuration() {
        return accessDuration;
    }

    public void setAccessDuration(int accessDuration) {
        this.accessDuration = accessDuration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getListPrice() {
        return listPrice;
    }

    public void setListPrice(float listPrice) {
        this.listPrice = listPrice;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PricePackage{" + "pricePackageID=" + pricePackageID + ", PPname=" + PPname + ", subjectID=" + subjectID + ", accessDuration=" + accessDuration + ", status=" + status + ", listPrice=" + listPrice + ", salePrice=" + salePrice + ", description=" + description + '}';
    }

    
           
}
