package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    User getUserById(Long id);
    void deleteUser(Long id);
    void updateUser(User user);
}
