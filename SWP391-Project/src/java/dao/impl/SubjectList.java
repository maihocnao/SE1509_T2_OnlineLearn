/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.PricePackage;
import bean.Subject;
import dao.MyDAO;
import dao.itf.SubjectDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SubjectList extends MyDAO implements SubjectDAO{

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       public ArrayList<Subject> getFeaturedSubject() {
        ArrayList<Subject> featuredSubjectList = new ArrayList<>();
        String sql = "select subject.subjectID, subject.name, subject.thumbnail, subject.description from subject inner join category on category.categoryID = subject.categoryID ";
        try {
            if (con != null) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Subject featureSubject = new Subject();
                    featureSubject.setSubjectID(rs.getInt(1));
                    featureSubject.setThumbnail(rs.getString(3));
                    featureSubject.setName(rs.getString(2));
                    featureSubject.setDescription(rs.getString(4));
                    featuredSubjectList.add(featureSubject);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return featuredSubjectList;
    }
public ArrayList<Subject> getAllSubject(){
    ArrayList<Subject> AllSubjectList = new ArrayList<>();
        String sql = "select * from [Subject] ";
        try {
         
            if (con != null) {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Subject featureSubject = new Subject();
                    featureSubject.setSubjectID(rs.getInt(1));
                    featureSubject.setCategoryID(rs.getInt(2));
                    featureSubject.setThumbnail(rs.getString(3));
                    featureSubject.setName(rs.getString(4));
                    featureSubject.setDescription(rs.getString(5));
                    AllSubjectList.add(featureSubject);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    return AllSubjectList;
}
    public static void main(String[] args) {
        SubjectList sjl = new SubjectList();
        System.out.println(sjl.getAllSubject());
    }
}
