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
