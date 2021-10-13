/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-11    1.0        Mai           First Version<br>
 */
package dao;
import bean.Lesson;
import java.util.ArrayList;

/**
 * This class contains methods to help us manipulate Lesson objects in the
 * database.
 *
 * @author Mai
 */
public interface LessonDAO {
    /**
     * Get top All Lessons options according in the database
     *
     * @param sid it is a string
     * @return a list <code>Lesson</code> object
     * @throws Exception
     */
    public ArrayList<Lesson> getAllLessonBySID(String sid) throws Exception;
    /**
     * Get First Lesson option according in the database
     *
     * @param lessonID it is an int
     * @return a list <code>Lesson</code> object
     * @throws Exception
     */
    public Lesson getALessonByID(int lessonID) throws Exception;
    /**
     * Get top A Lesson options according in the database
     *
     * @param sid it is a string
     * @return a list <code>Lesson</code> object
     * @throws Exception
     */
    public Lesson getFirstLesson(String sid) throws Exception;
}
