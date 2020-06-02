package web.dao;

import web.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleDao {

    List<Role> findAllRoles();
    Role findRole(long id);
    Role getRoleByName(String role);

}
