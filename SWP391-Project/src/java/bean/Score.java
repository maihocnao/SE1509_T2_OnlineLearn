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
    int quizID;
    int score;
    String phone;

    public Score() {
    }

    public Score(int quizID, int score, String phone) {
        this.quizID = quizID;
        this.score = score;
        this.phone = phone;
    }

    public int getQuizID() {
        return quizID;
    }

    public int getScore() {
        return score;
    }

    public String getPhone() {
        return phone;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Score{" + "quizID=" + quizID + ", score=" + score + ", phone=" + phone + '}';
    }
    
    
}
