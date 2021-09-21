/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.itf;

import bean.Quiz;

/**
 *
 * @author Viettech88.vn
 */
public interface QuizDAO {
    
    public void addQuiz();
    
    public Quiz getQuiz();
    
    public void editQuiz();
    
    
    public void deleteQuiz();
}
