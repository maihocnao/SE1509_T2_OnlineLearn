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
public class Course {
    int courseID; 
    int subjectID; 
    int registrationID; 
    String title; 
    String tagline; 
    String briefInfo;
    byte status; 

    public Course() {
    }

    public Course(int courseID, int subjectID, int registrationID, String title, String tagline, String briefInfo, byte status) {
        this.courseID = courseID;
        this.subjectID = subjectID;
        this.registrationID = registrationID;
        this.title = title;
        this.tagline = tagline;
        this.briefInfo = briefInfo;
        this.status = status;
    }

    public int getCourseID() {
        return courseID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public int getRegistrationID() {
        return registrationID;
    }

    public String getTitle() {
        return title;
    }

    public String getTagline() {
        return tagline;
    }

    public String getBriefInfo() {
        return briefInfo;
    }

    public byte getStatus() {
        return status;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public void setRegistrationID(int registrationID) {
        this.registrationID = registrationID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public void setBriefInfo(String briefInfo) {
        this.briefInfo = briefInfo;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Course{" + "courseID=" + courseID + ", subjectID=" + subjectID + ", registrationID=" + registrationID + ", title=" + title + ", tagline=" + tagline + ", briefInfo=" + briefInfo + ", status=" + status + '}';
    }
          
    
}
