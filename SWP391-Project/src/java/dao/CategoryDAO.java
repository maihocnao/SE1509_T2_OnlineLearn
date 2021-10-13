/*
 * Copyright (C) 2021, TEAM 2 ONLINE LEARN
 *
 * SWP_OnlineLearn
 * SWP ONLINE LEARN PROJECT - TEAM 2
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-30    1.0        Mai           First Version<br>
 * 2021-10-09    1.1        Quan          Second Version<br>
 */
package dao;

import bean.Category;
import java.util.ArrayList;

/**
 *
 * @author Viettech88.vn
 */
public interface CategoryDAO {
    public ArrayList<Category> getAllCategories();
    public void updateCategory(String type, String categoryName,int categoryID);
    public Category getCategoryById(int id);
    public void deleteCategory(int id);
    public void addCategory(String type, String name);
}
