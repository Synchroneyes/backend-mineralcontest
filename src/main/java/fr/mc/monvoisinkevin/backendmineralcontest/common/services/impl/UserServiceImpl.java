package fr.mc.monvoisinkevin.backendmineralcontest.common.services.impl;

import fr.mc.monvoisinkevin.backendmineralcontest.common.entities.User;
import fr.mc.monvoisinkevin.backendmineralcontest.common.repositories.UserRepository;
import fr.mc.monvoisinkevin.backendmineralcontest.common.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
/**
 * This class is an implementation of our user service.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * findAll will return every users from our database
     * @return list of every users
     */
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * addUser will persist the given user into our database
     * @param user to persist
     * @return persisted user
     */
    @Override
    public User addUser(User user) {
        User persisted = userRepository.save(user);
        userRepository.flush();
        return persisted;
    }
}
