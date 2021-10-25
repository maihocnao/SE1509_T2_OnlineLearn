/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-15    1.0        Mai           First Version<br>
 */
package dao;

/**
 * This class contains methods to help us manipulate TrackLearning objects in the
 * database.
 *
 * @author Mai
 */
public interface TrackLearningDAO {
    /**
     * Get lessonID of TrackLearning  object according in the database
     *
     * @param userID it is an integer
     * @param subjectID it is a String
     * @return a integer <code>lessonID</code> attribute
     * @throws Exception
     */
    public int getCurrentLessonID(int userID, String subjectID) throws Exception;
    /**
     * Update lessonID of TrackLearning  object according in the database
     *
     * @param userID it is an integer
     * @param subjectID it is a String
     * @param lessonID it is an integer
     * @return nothing, only update in database
     * @throws Exception
     */
    public void updateCurrentLesson(int userID, String subjectID, int lessonID) throws Exception;
}
