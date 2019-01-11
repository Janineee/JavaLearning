package com.janine.other;

import com.janine.pojo.User;
import com.janine.util.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class FirstUse {

    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;

    static {
        sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
    }

    public static User firstUse() throws IOException {

        // 执行查询, sql ID, 入参
        User user = sqlSession.selectOne("user.getUserById", 1);
        sqlSession.close();
        return user;
    }

    public static List<User> getUserByUserName() {
        List<User> list = sqlSession.selectList("user.getUserByUserName", "张");
        sqlSession.close();
        return list;
    }

    public static void insertUser() {
        User user = new User();
        user.setUsername("简宁");
        user.setSex("0");
        user.setBirthday(new Date());
        user.setAddress("杭州");
        sqlSession.insert("user.insertUser", user);
        sqlSession.commit();
        sqlSession.close();
    }

    public static void updateUser() {
        User user = new User();
        user.setId(29);
        user.setUsername("简3宁");
        sqlSession.update("user.updateUser", user);
        sqlSession.commit();
        sqlSession.close();
    }
}
