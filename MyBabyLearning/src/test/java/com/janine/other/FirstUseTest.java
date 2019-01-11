package com.janine.other;

import com.janine.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class FirstUseTest {

    @Test
    public void atest() throws IOException {
        System.out.println(FirstUse.firstUse());

    }

    @Test
    public void getUserByUserName() {
        System.out.println(FirstUse.getUserByUserName());
    }

    @Test
    public void insertUser() {
        FirstUse.insertUser();
    }

    @Test
    public void updateUser() {
        FirstUse.updateUser();
    }
}