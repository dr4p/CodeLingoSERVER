package com.codelingo.service;

import com.codelingo.model.User;
import com.codelingo.model.UserRole;

import java.util.Set;

public interface UserService {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get User By username
    public User getUser(String username);

    //delete user by id
    public void deleteUser(Long userId);

}
