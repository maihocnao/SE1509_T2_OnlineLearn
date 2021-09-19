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
    int accessDuration; 
    int subjectID;
    float listPrice;
    float salePrice;
    byte status;
    String name;
    String description; 

    public PricePackage() {
    }

    public PricePackage(int pricePackageID, int accessDuration, int subjectID, float listPrice, float salePrice, byte status, String name, String description) {
        this.pricePackageID = pricePackageID;
        this.accessDuration = accessDuration;
        this.subjectID = subjectID;
        this.listPrice = listPrice;
        this.salePrice = salePrice;
        this.status = status;
        this.name = name;
        this.description = description;
    }

    public int getPricePackageID() {
        return pricePackageID;
    }

    public int getAccessDuration() {
        return accessDuration;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public float getListPrice() {
        return listPrice;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public byte getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setPricePackageID(int pricePackageID) {
        this.pricePackageID = pricePackageID;
    }

    public void setAccessDuration(int accessDuration) {
        this.accessDuration = accessDuration;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public void setListPrice(float listPrice) {
        this.listPrice = listPrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PricePackage{" + "pricePackageID=" + pricePackageID + ", accessDuration=" + accessDuration + ", subjectID=" + subjectID + ", listPrice=" + listPrice + ", salePrice=" + salePrice + ", status=" + status + ", name=" + name + ", description=" + description + '}';
    }
    
    
           
}
