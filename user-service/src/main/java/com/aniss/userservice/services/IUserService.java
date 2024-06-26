package com.aniss.userservice.services;

import com.aniss.userservice.entities.User;
import com.aniss.userservice.requests.CreateUser;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User create(CreateUser createUser);
    Optional<User> get(Long id);
    List<User> GetAllUsers();
    void delete(User user);
}
