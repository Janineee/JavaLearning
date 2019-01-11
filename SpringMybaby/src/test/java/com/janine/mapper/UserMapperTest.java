package com.janine.mapper;

import com.janine.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserMapperTest {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

    @Test
    public void getUserById() {
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        User user = userMapper.getUserById(28);
        System.out.println(user);
    }

    @Test
    public void getUserByUserName() {
    }

    @Test
    public void insertUser() {
    }
}