package com.janine.traditional.dao.impl;

import com.janine.pojo.User;
import com.janine.traditional.dao.UserDao;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    UserDao userDao = new UserDaoImpl();

    @Test
    public void getUserById() {
        System.out.println(userDao.getUserById(28));
    }

    @Test
    public void getUserByUserName() {
        System.out.println(userDao.getUserByUserName("简3宁"));
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUsername("Janine");
        userDao.insertUser(user);
    }
}