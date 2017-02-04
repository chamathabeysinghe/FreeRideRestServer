package com.freeride.service;

import com.freeride.model.User;

import java.util.List;

/**
 * Created by Chamath Abeysinghe on 2/4/2017.
 */
public interface UserService {

    User findById(Long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    void deleteAllUsers();

    List<User> findAllUsers();

    boolean isUserExist(User user);
}
