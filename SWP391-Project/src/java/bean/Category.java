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
public class Category {
    int categoryID ; 
    String type;
    String categoryName ;

    public Category() {
    }

    public Category(int categoryID, String type, String categoryName) {
        this.categoryID = categoryID;
        this.type = type;
        this.categoryName = categoryName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" + "categoryID=" + categoryID + ", type=" + type + ", categoryName=" + categoryName + '}';
    }

    
    
    
}
