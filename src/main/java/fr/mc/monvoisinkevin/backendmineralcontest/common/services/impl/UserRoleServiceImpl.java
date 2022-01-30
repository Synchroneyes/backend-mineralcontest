package fr.mc.monvoisinkevin.backendmineralcontest.common.services.impl;

import fr.mc.monvoisinkevin.backendmineralcontest.common.entities.UserRole;
import fr.mc.monvoisinkevin.backendmineralcontest.common.repositories.UserRoleRepository;
import fr.mc.monvoisinkevin.backendmineralcontest.common.services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * This class is an implementation of our user role service.
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    /**
     * findAll will return every users roles from our database
     * @return list of every users roles
     */
    @Override
    public List<UserRole> findAll() {
        return userRoleRepository.findAll();
    }

    /**
     * addUser will persist the given user role into our database
     * @param userRole to persist
     * @return persisted user role
     */
    @Override
    public UserRole addRole(UserRole userRole) {
        UserRole persisted = userRoleRepository.save(userRole);
        userRoleRepository.flush();
        return persisted;
    }
}
