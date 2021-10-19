/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Phong
 */
public class Role {
    String roleID;
    String roleName;
    String roleDescription;

    public Role() {
    }

    public Role(String roleID, String roleName, String roleDescription) {
        this.roleID = roleID;
        this.roleName = roleName;
        this.roleDescription = roleDescription;
    }

    public String getRoleID() {
        return roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    @Override
    public String toString() {
        return "Role{" + "roleID=" + roleID + ", roleName=" + roleName + ", roleDescription=" + roleDescription + '}';
    }
    
    
}
