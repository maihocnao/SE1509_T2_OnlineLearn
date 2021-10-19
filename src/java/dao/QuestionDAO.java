/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Question;

/**
 *
 * @author Viettech88.vn
 */
public interface QuestionDAO {
    
    public void addQuestion();
    
    public Question getQuestion();
    
    public void editQuestion();
    
    public void deleteQuestion();
}
