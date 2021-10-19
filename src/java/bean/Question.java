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

/**
 *
 * @author Phong
 */
public class Question {
    int questionID ; 
    int quizID ; 
    String content ; 
    String level;

    public Question() {
    }

    public Question(int questionID, int quizID, String content, String level) {
        this.questionID = questionID;
        this.quizID = quizID;
        this.content = content;
        this.level = level;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Question{" + "questionID=" + questionID + ", quizID=" + quizID + ", content=" + content + ", level=" + level + '}';
    }
    
    
}
