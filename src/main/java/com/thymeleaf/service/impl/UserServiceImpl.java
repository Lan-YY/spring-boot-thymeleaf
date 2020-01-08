package com.thymeleaf.service.impl;

import com.thymeleaf.mapper.UserMapper;
import com.thymeleaf.pojo.User;
import com.thymeleaf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Package: com.web.web.service
 * <p>
 * Description： TODO
 * <p>
 * Author: 作者
 * <p>
 * Date: Created in 2019/12/31 9:03
 * <p>
 * Company: 公司
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String userName, String password) {
        return userMapper.findByUserName(userName,password);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int deleteUser(Long id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateById(user);
    }


    @Override
    public User getUser(Long userId) {
        return userMapper.selectById(userId);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }
}
