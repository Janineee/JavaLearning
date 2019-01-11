package com.janine.dao.impl;

import com.janine.dao.UserDao;
import com.janine.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User getUserById(Integer id) {
        SqlSession sqlSession = super.getSqlSession();
        User user = sqlSession.selectOne("user.getUserById", id);
        // 不能关闭SqlSession
        return user;
    }

    @Override
    public List<User> getUserByUserName(String username) {
        SqlSession sqlSession = super.getSqlSession();
        List<User> userList = sqlSession.selectList("user.getUserByUserName", username);
        return userList;
    }

    @Override
    public void insertUser(User user) {
        SqlSession sqlSession = super.getSqlSession();
        sqlSession.insert("user.insertUser", user);
        return;
    }

    {



    }

}
