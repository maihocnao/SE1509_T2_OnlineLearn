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
    int subjectID; 
    String content; 
    String lessonName;
    int courseID; 
    byte status;

    public Lesson() {
    }

    public Lesson(int lessonID, int subjectID, String content, String lessonName, int courseID, byte status) {
        this.lessonID = lessonID;
        this.subjectID = subjectID;
        this.content = content;
        this.lessonName = lessonName;
        this.courseID = courseID;
        this.status = status;
    }

    public int getLessonID() {
        return lessonID;
    }

    public void setLessonID(int lessonID) {
        this.lessonID = lessonID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

   

    
    
    
    
}
