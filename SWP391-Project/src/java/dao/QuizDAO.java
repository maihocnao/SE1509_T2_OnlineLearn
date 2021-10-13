/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-30    1.0        Mai           First Version<br>
 */
package dao;

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
