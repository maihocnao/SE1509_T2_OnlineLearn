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
public class Quiz {
    int quizID ; 
    int lessonID ; 
    int numOfQuestion; 
    int duration;
    int subjectID; 
    float passRate; 
    String quizName; 
    String level; 
    String quizType; 

    public Quiz() {
    }

    public Quiz(int quizID, int lessonID, int numOfQuestion, int duration, int subjectID, float passRate, String quizName, String level, String quizType) {
        this.quizID = quizID;
        this.lessonID = lessonID;
        this.numOfQuestion = numOfQuestion;
        this.duration = duration;
        this.subjectID = subjectID;
        this.passRate = passRate;
        this.quizName = quizName;
        this.level = level;
        this.quizType = quizType;
    }

    public int getQuizID() {
        return quizID;
    }

    public int getLessonID() {
        return lessonID;
    }

    public int getNumOfQuestion() {
        return numOfQuestion;
    }

    public int getDuration() {
        return duration;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public float getPassRate() {
        return passRate;
    }

    public String getQuizName() {
        return quizName;
    }

    public String getLevel() {
        return level;
    }

    public String getQuizType() {
        return quizType;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public void setLessonID(int lessonID) {
        this.lessonID = lessonID;
    }

    public void setNumOfQuestion(int numOfQuestion) {
        this.numOfQuestion = numOfQuestion;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public void setPassRate(float passRate) {
        this.passRate = passRate;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setQuizType(String quizType) {
        this.quizType = quizType;
    }

    @Override
    public String toString() {
        return "Quiz{" + "quizID=" + quizID + ", lessonID=" + lessonID + ", numOfQuestion=" + numOfQuestion + ", duration=" + duration + ", subjectID=" + subjectID + ", passRate=" + passRate + ", quizName=" + quizName + ", level=" + level + ", quizType=" + quizType + '}';
    }
    
    
}
