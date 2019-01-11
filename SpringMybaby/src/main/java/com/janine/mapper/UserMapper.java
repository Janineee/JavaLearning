package com.janine.mapper;

import com.janine.pojo.User;

import java.util.List;

public interface UserMapper {
    User getUserById(Integer id);
    List<User> getUserByUserName(String userName);
    void insertUser(User user);
}
