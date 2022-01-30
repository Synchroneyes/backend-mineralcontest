package fr.mc.monvoisinkevin.backendmineralcontest.common.services;


import fr.mc.monvoisinkevin.backendmineralcontest.common.entities.UserRole;

import java.util.List;

/**
 * This service is used to interact with user roles from our database and distribute them
 */
public interface UserRoleService {

    /**
     * This method will fetch every roles in the database
     * @return list of every roles
     */
    public List<UserRole> findAll();

    /**
     * This method will persiste a role given as argument, in our database.
     * @param role to persist
     * @return role persisted
     */
    public UserRole addRole(UserRole role);
}
