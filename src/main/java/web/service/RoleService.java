package web.service;

import web.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAllRoles();
    Role findRole(long id);
    Role getRoleByName(String role);

}
