package com.janine.mapper;

import com.janine.pojo.Order;
import com.janine.pojo.OrderUser;
import com.janine.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OrderMapperTest {

    @Test
    public void getOrderList() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        List<Order> list = orderMapper.getOrderList();
        for (Order order : list)
            System.out.println(order);

        sqlSession.close();
    }

    @Test
    public void getOrderUser() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        List<OrderUser> list = orderMapper.getOrderUser();
        sqlSession.close();

        for (OrderUser orderUser : list)
            System.out.println(orderUser);

    }

    @Test
    public void getOrderUserMap() {
        SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        List<Order> list = orderMapper.getOrderUserMap();
        sqlSession.close();

        for (Order order : list)
            System.out.println(order);
    }
}