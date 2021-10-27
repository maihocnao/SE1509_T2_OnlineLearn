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

import java.util.List;
import java.util.Map;

/**
 *
 * @author Phong
 */
public class Question implements Comparable<Question> {

    int questionID;
    String subjectID;
    String content;
    String level;
    int userAnswer = -1;
    List<Answer> answer;

    public Question() {
    }

    public Question(int questionID, String subjectID, String content, String level) {
        this.questionID = questionID;
        this.subjectID = subjectID;
        this.content = content;
        this.level = level;
    }

    public int getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

 

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
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
        return "Question{" + "questionID=" + questionID + ", subjectID=" + subjectID + ", content=" + content + ", level=" + level + '}';
    }

    @Override
    public int compareTo(Question o) {
     return this.content.compareTo(o.getContent());
    }

}
