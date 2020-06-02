package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Set;

@Repository
public class RoleDaoImp implements RoleDao {

    @PersistenceContext
    private final EntityManager entityManager;

    public RoleDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Role> findAllRoles() {
        List<Role> roles = entityManager.createQuery("From Role ", Role.class).getResultList();
        return roles;
    }

    @Override
    public Role findRole(long id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public Role getRoleByName(String role) {
        Role role1 = entityManager.createQuery("FROM Role WHERE role = :role", Role.class)
                .setParameter("role", role)
                .getSingleResult();
        return role1;
    }


}
