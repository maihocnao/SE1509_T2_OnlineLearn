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
public class Blog {
    int blogID ; 
    int userID ; 
    String fullname ; 
    int categoryID ; 
    String thumbnail ;
    String title ;
    String updatedDate ; 
    String blogDetail ; 
    byte flag ; 
    byte status ; 

    public Blog() {
    }

    public Blog(int blogID, int userID, String fullname, int categoryID, String thumbnail, String title, String updatedDate, String blogDetail, byte flag, byte status) {
        this.blogID = blogID;
        this.userID = userID;
        this.fullname = fullname;
        this.categoryID = categoryID;
        this.thumbnail = thumbnail;
        this.title = title;
        this.updatedDate = updatedDate;
        this.blogDetail = blogDetail;
        this.flag = flag;
        this.status = status;
    }

    public int getBlogID() {
        return blogID;
    }

    public int getUserID() {
        return userID;
    }

    public String getFullname() {
        return fullname;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public String getBlogDetail() {
        return blogDetail;
    }

    public byte getFlag() {
        return flag;
    }

    public byte getStatus() {
        return status;
    }

    public void setBlogID(int blogID) {
        this.blogID = blogID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public void setBlogDetail(String blogDetail) {
        this.blogDetail = blogDetail;
    }

    public void setFlag(byte flag) {
        this.flag = flag;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Blog{" + "blogID=" + blogID + ", userID=" + userID + ", fullname=" + fullname + ", categoryID=" + categoryID + ", thumbnail=" + thumbnail + ", title=" + title + ", updatedDate=" + updatedDate + ", blogDetail=" + blogDetail + ", flag=" + flag + ", status=" + status + '}';
    }
    
    
}
