/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Lesson;

/**
 *
 * @author Viettech88.vn
 */
public interface LessonDAO {
    void list();
    Lesson getOne(int id);
    void insert(Lesson lesson);
    void update(Lesson lesson);
}
