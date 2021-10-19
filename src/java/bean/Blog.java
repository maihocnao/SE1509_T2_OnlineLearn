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


public class Blog {
    int blogID ; 
    int userID ; 
    int categoryID ; 
    String thumbnail ;
    String title ;
    String updatedDate ; 
    String blogContent ; 
    byte flag ; 
    String status ; 

    public Blog() {
    }

    public Blog(int blogID, int userID, int categoryID, String thumbnail, String title, String updatedDate, String blogContent, byte flag, String status) {
        this.blogID = blogID;
        this.userID = userID;
        this.categoryID = categoryID;
        this.thumbnail = thumbnail;
        this.title = title;
        this.updatedDate = updatedDate;
        this.blogContent = blogContent;
        this.flag = flag;
        this.status = status;
    }

    public int getBlogID() {
        return blogID;
    }

    public void setBlogID(int blogID) {
        this.blogID = blogID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public byte getFlag() {
        return flag;
    }

    public void setFlag(byte flag) {
        this.flag = flag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Blog{" + "blogID=" + blogID + ", userID=" + userID + ", categoryID=" + categoryID + ", thumbnail=" + thumbnail + ", title=" + title + ", updatedDate=" + updatedDate + ", blogContent=" + blogContent + ", flag=" + flag + ", status=" + status + '}';
    }

    
}
