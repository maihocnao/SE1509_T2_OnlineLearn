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
public class Answer {
    int answerID ; 
    int questionID ; 
    int  result ; 
    String content ; 

    public Answer() {
    }

    public Answer(int answerID, int questionID, int result, String content) {
        this.answerID = answerID;
        this.questionID = questionID;
        this.result = result;
        this.content = content;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Answer{" + "answerID=" + answerID + ", questionID=" + questionID + ", result=" + result + ", content=" + content + '}';
    }

    
    
    
}
