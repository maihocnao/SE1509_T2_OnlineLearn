/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Viettech88.vn
 */
public class TrackLearning {
    int trackID;
    int userID;
    int regisID;
    int lessonID;
    String subjectID;

    public TrackLearning() {
    }

    public TrackLearning(int trackID, int userID, int regisID, int lessonID, String subjectID) {
        this.trackID = trackID;
        this.userID = userID;
        this.regisID = regisID;
        this.lessonID = lessonID;
        this.subjectID = subjectID;
    }

    public int getTrackID() {
        return trackID;
    }

    public void setTrackID(int trackID) {
        this.trackID = trackID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getRegisID() {
        return regisID;
    }

    public void setRegisID(int regisID) {
        this.regisID = regisID;
    }

    public int getLessonID() {
        return lessonID;
    }

    public void setLessonID(int lessonID) {
        this.lessonID = lessonID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    @Override
    public String toString() {
        return "TrackLearning{" + "trackID=" + trackID + ", userID=" + userID + ", regisID=" + regisID + ", lessonID=" + lessonID + ", subjectID=" + subjectID + '}';
    }
    
    
}
