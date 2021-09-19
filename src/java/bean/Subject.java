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
    int subjectID ; 
    int categoryID ; 
    String thumbnail;
    String name; 
    String Description; 

    public Subject() {
    }

    public Subject(int subjectID, int categoryID, String thumbnail, String name, String Description) {
        this.subjectID = subjectID;
        this.categoryID = categoryID;
        this.thumbnail = thumbnail;
        this.name = name;
        this.Description = Description;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectID=" + subjectID + ", categoryID=" + categoryID + ", thumbnail=" + thumbnail + ", name=" + name + ", Description=" + Description + '}';
    }
    
    
}
