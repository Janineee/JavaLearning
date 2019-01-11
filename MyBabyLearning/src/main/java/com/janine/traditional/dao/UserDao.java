package com.janine.traditional.dao;

import com.janine.pojo.User;

import java.util.List;

/**
 * 用户信息持久化接口
 */
public interface UserDao {
    User getUserById(Integer id);
    List<User> getUserByUserName(String userName);
    void insertUser(User user);
}
