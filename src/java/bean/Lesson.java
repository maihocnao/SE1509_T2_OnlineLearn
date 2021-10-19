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
public class Lesson {
    int lessonID; 
    String lessonType;
    String lessonName;
    String youtubeLink;
    String content; 
    String status;
    String subjectID; 
  

    public Lesson() {
    }

    public Lesson(int lessonID, String lessonType, String lessonName, String youtubeLink, String content, String status, String subjectID) {
        this.lessonID = lessonID;
        this.lessonType = lessonType;
        this.lessonName = lessonName;
        this.youtubeLink = youtubeLink;
        this.content = content;
        this.status = status;
        this.subjectID = subjectID;
    }

    public int getLessonID() {
        return lessonID;
    }

    public void setLessonID(int lessonID) {
        this.lessonID = lessonID;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    @Override
    public String toString() {
        return "Lesson{" + "lessonID=" + lessonID + ", lessonType=" + lessonType + ", lessonName=" + lessonName + ", youtubeLink=" + youtubeLink + ", content=" + content + ", status=" + status + ", subjectID=" + subjectID + '}';
    }

    
    
    
    
}
