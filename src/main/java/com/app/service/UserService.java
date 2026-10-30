package com.app.service;

import com.app.exception.UserException;
import com.app.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id) throws UserException;
    List<User> getAllUsers();
    void deleteUser(Long id) throws Exception;
    User updateUser(Long id, User user) throws Exception;

}
