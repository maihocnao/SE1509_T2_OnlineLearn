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