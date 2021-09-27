/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.itf;
import bean.Role;
import java.util.List;
/**
 *
 * @author Viettech88.vn
 */
public interface RoleDAO {
    void add();
    void update();
    Role findById(String id);
    List<Role> getRoleDesList();
}
