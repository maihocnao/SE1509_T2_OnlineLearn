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


public class Quiz {
    int quizID ; 
    int lessonID ; 
    String quizName; 
    String level; 
    int numOfQuestion; 
    int duration;//minute
    float passRate;  
    String quizType; 
    public Quiz() {
    }

    public Quiz(int quizID, int lessonID, String quizName, String level, int numOfQuestion, int duration, float passRate, String quizType) {
        this.quizID = quizID;
        this.lessonID = lessonID;
        this.quizName = quizName;
        this.level = level;
        this.numOfQuestion = numOfQuestion;
        this.duration = duration;
        this.passRate = passRate;
        this.quizType = quizType;
    }

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public int getLessonID() {
        return lessonID;
    }

    public void setLessonID(int lessonID) {
        this.lessonID = lessonID;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getNumOfQuestion() {
        return numOfQuestion;
    }

    public void setNumOfQuestion(int numOfQuestion) {
        this.numOfQuestion = numOfQuestion;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getPassRate() {
        return passRate;
    }

    public void setPassRate(float passRate) {
        this.passRate = passRate;
    }

    public String getQuizType() {
        return quizType;
    }

    public void setQuizType(String quizType) {
        this.quizType = quizType;
    }

    @Override
    public String toString() {
        return "Quiz{" + "quizID=" + quizID + ", lessonID=" + lessonID + ", quizName=" + quizName + ", level=" + level + ", numOfQuestion=" + numOfQuestion + ", duration=" + duration + ", passRate=" + passRate + ", quizType=" + quizType + '}';
    }

   
}
