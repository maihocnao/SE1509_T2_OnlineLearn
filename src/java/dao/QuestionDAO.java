/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Question;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Viettech88.vn
 */
public interface QuestionDAO {
    
    public void addQuestion();
    
    public Question getQuestion();
    
    public void editQuestion();
    
    public void deleteQuestion();
    public Question getById(int id);
    public List<Question> getBySubject(Map<String,Integer> ratio, String subjectId);
    public int countQuestionByLevel(String level, String subjectID);
    public List<Question> getByLevelAndSubject(String subjectId, String level, List<Integer> listId);
    public void insertMany(List<Question> data);
}
