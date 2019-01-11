package com.janine.dao.impl;

import com.janine.dao.UserDao;
import com.janine.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    private ApplicationContext applicationContext;

    @Before
    public void getContext(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    @Test
    public void getUserById() {
        UserDao userDao = applicationContext.getBean(UserDao.class);
        User user = userDao.getUserById(28);
        System.out.println(user);
    }

    @Test
    public void getUserByUserName() {
    }

    @Test
    public void insertUser() {
    }
}