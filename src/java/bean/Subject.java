/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        TEAM 2          First Version<br>
 */
package bean;


public class Subject {
    String subjectID ; 
    int categoryID ; 
    String thumbnail;
    String name; 
    String description; 
    String status;
    String featured;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    String owner;
    public Subject() {
    }

    public Subject(String subjectID, int categoryID, String thumbnail, String name, String description, String status, String featured) {
        this.subjectID = subjectID;
        this.categoryID = categoryID;
        this.thumbnail = thumbnail;
        this.name = name;
        this.description = description;
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
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
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
        return "Subject{" + "subjectID=" + subjectID + ", categoryID=" + categoryID + ", thumbnail=" + thumbnail + ", name=" + name + ", Description=" + description + ", status=" + status + ", featured=" + featured + '}';
    }

    
}
