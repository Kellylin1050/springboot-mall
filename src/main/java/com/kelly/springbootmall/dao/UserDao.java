package com.kelly.springbootmall.dao;

import com.kelly.springbootmall.dto.UserRegisterRequest;
import com.kelly.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
