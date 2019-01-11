package com.janine.dao;

import com.janine.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public interface UserDao {
    User getUserById(Integer id);

    List<User> getUserByUserName(String username);

    void insertUser(User user);
}
