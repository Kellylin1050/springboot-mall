package com.kelly.springbootmall.service.impl;

import com.kelly.springbootmall.dao.UserDao;
import com.kelly.springbootmall.dto.UserRegisterRequest;
import com.kelly.springbootmall.model.User;
import com.kelly.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
