/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Viettech88.vn
 */
public class UrlPatternForRole {
    int id;
    int roleID;
    String roleName;
    String urlPattern;
    String pageName;

    public UrlPatternForRole() {
    }

    public UrlPatternForRole(int id, int roleID, String roleName, String urlPattern,String pageName) {
        this.id = id;
        this.roleID = roleID;
        this.roleName = roleName;
        this.urlPattern = urlPattern;
        this.pageName = pageName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    @Override
    public String toString() {
        return "UrlPatternForRole{" + "id=" + id + ", roleID=" + roleID + ", roleName=" + roleName + ", urlPattern=" + urlPattern + ", pageName=" + pageName + '}';
    }
    
        
    
    
}
