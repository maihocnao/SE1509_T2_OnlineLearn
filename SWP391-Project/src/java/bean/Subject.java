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
public class Subject {
    String subjectID ; 
    int categoryID ; 
    String thumbnail;
    String name; 
    String Description; 
    String status;
    String featured;

    public Subject() {
    }

    public Subject(String subjectID, int categoryID, String thumbnail, String name, String Description, String status, String featured) {
        this.subjectID = subjectID;
        this.categoryID = categoryID;
        this.thumbnail = thumbnail;
        this.name = name;
        this.Description = Description;
        this.status = status;
        this.featured = featured;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFeatured() {
        return featured;
    }

    public void setFeatured(String featured) {
        this.featured = featured;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectID=" + subjectID + ", categoryID=" + categoryID + ", thumbnail=" + thumbnail + ", name=" + name + ", Description=" + Description + ", status=" + status + ", featured=" + featured + '}';
    }

    
}
