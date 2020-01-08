package com.thymeleaf.service;


import com.thymeleaf.pojo.User;

import java.util.List;

public interface UserService {
    public User login(String userName, String password);
    public int addUser(User user);
    public int deleteUser(Long id);
    public int updateUser(User user);
    public User getUser(Long userId);
    public List<User>  findAllUsers();

}
