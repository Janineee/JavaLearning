package com.janine.mapper;

import com.janine.pojo.Order;
import com.janine.pojo.QueryVo;
import com.janine.pojo.User;
import com.janine.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    @Test
    public void getUserById() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        // 获取接口的代理实现类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(29);
        sqlSession.close();
        System.out.println(user);
    }

    @Test
    public void getUserByUserName() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        // 获取接口的代理实现类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserByUserName("简");
        sqlSession.close();
        for (User user : userList)
            System.out.println(user);
    }

    @Test
    public void insertUser() {
    }

    @Test
    public void getUserByPojo() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        // 获取接口的代理实现类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("简");
        user.setSex("1");
        List<User> userList = userMapper.getUserByPojo(user);
        for (User user1 : userList) {
            System.out.println(user1.getSex());
            if ("".equals(user1.getSex()))
                System.out.println("null~~~~~");
            System.out.println(user1);
        }
        sqlSession.close();
    }

    @Test
    public void getUserByIds() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        QueryVo queryVo = new QueryVo();
        queryVo.setIds(Arrays.asList(1, 28, 29));
        List<User> userList = userMapper.getUserByIds(queryVo);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void getUserOrderMap() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserOrderMap();
        for (User user : userList) {
            System.out.println(user);
            // System.out.println(user.getOrderList());
            if (!user.getOrderList().isEmpty()) {
                for (Order order :
                        user.getOrderList()) {
                    System.out.println("这个用户的订单有：");
                    System.out.println(order);
                    System.out.println();
                }
            }
        }
    }
}