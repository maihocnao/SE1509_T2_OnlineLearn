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
public class Question {
    int questionID ; 
    int quizID ; 
    String content ; 

    public Question() {
    }

    public Question(int questionID, int quizID, String content) {
        this.questionID = questionID;
        this.quizID = quizID;
        this.content = content;
    }

    public int getQuestionID() {
        return questionID;
    }

    public int getQuizID() {
        return quizID;
    }

    public String getContent() {
        return content;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Question{" + "questionID=" + questionID + ", quizID=" + quizID + ", content=" + content + '}';
    }
    
    
}
