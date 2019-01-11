package com.janine.traditional.dao.impl;

import com.janine.pojo.User;
import com.janine.traditional.dao.UserDao;
import com.janine.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public User getUserById(Integer id) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        User user = sqlSession.selectOne("getUserById", id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> getUserByUserName(String userName) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        List<User> userList = sqlSession.selectList("getUserByUserName", userName);
        sqlSession.commit();
        sqlSession.close();
        return userList;
    }

    @Override
    public void insertUser(User user) {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        sqlSession.insert("insertUser", user);
        sqlSession.commit();
        sqlSession.close();
    }
}
