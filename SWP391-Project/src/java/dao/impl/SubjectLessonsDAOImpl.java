/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * OnlineLearn_SWP<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        TEAM 2          First Version<br>
 */
package dao.impl;

import bean.Lesson;
import bean.Subject;
import dao.LessonDAO;
import dao.MyDAO;
import java.sql.SQLException;

/**This class with method method of query or update data from table
 *
 * @author ADMIN
 */
public class SubjectLessonsDAOImpl extends MyDAO implements LessonDAO{
     /**
     * Get lessonID of SubjectLession object according in the database
     *
     * @param id it is an integer
     * @return a integer <code>lesson</code> attribute
     * @throws Exception
     */
     public Lesson getALessonByID(int id) throws Exception {
        String sql = "select * from [lesson] where lessonID = ? ";
        Lesson ls = new Lesson();
        try {
            if (con != null) {
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                while (rs.next()) {
                   ls.setLessonID(rs.getString("lessonID"));
                   ls.setLessonName(rs.getString("lessonName"));
                    ls.setLessonType(rs.getString("lessonType"));
                     ls.setYoutubeLink(rs.getString("youtubeLink"));
                    ls.setContent(rs.getString("Content"));
                    ls.setStatus(rs.getString("Status"));
                    ls.setSubjectID(rs.getString("SubjectId"));
                }
            }
        } catch (SQLException e){}
        return ls;
    }
//    public static void main(String[] args) throws Exception {
//        SubjectLessonsDAOImpl sj = new SubjectLessonsDAOImpl();
//        System.out.println(sj.getALessonByID(3));
//    }
    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
