package dao;
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
import bean.Blog;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;



/**
 *
 * @author phong
 */
public interface BlogDAO {
   

    void closeConnection() throws SQLException;
    /**
     * Get a User according to email
     *
     * @param no param
     * @return an arraylist of blog
     * @throws Exception
     */
    public ArrayList<Blog> getAllBlog() throws Exception ;
    public ArrayList<Blog> get2Post() throws Exception;
    
    
        
}
