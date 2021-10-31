/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import bean.UrlPatternForRole;
import java.util.List;

/**
 *
 * @author Viettech88.vn
 */
public interface UrlPatternDAO {
    public ArrayList<UrlPatternForRole> allUrlRole() throws Exception;
    public ArrayList<UrlPatternForRole> urlbyRole(String roleId) throws Exception;
}
