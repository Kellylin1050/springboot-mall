package com.kelly.springbootmall.service;

import com.kelly.springbootmall.dto.UserLoginRequest;
import com.kelly.springbootmall.dto.UserRegisterRequest;
import com.kelly.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
