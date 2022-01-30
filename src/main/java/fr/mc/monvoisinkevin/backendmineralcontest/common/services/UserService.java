package fr.mc.monvoisinkevin.backendmineralcontest.common.services;

import fr.mc.monvoisinkevin.backendmineralcontest.common.entities.User;

import java.util.List;

/**
 * This service is used to interact with users from our database and distribute them
 */
public interface UserService {

    /**
     * This method will return a list which contains every user in the database
     * @return list of every users in the database
     */
    public List<User> findAll();

    /**
     * This method will save a given user into our database, and returns the one persisted
     * @param user to persist
     * @return user persisted
     */
    public User addUser(User user);
}
