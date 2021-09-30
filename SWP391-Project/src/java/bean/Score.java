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


public class Score {
    int scoreID;
    int quizID;
    float score;
    int userID;

    public Score() {
    }

    public Score(int scoreID, int quizID, float score, int userID) {
        this.scoreID = scoreID;
        this.quizID = quizID;
        this.score = score;
        this.userID = userID;
    }

    public int getScoreID() {
        return scoreID;
    }

    public void setScoreID(int scoreID) {
        this.scoreID = scoreID;
    }

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Score{" + "scoreID=" + scoreID + ", quizID=" + quizID + ", score=" + score + ", userID=" + userID + '}';
    }

    
    
}
