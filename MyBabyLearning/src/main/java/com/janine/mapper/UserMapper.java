package com.janine.mapper;

import com.janine.pojo.Order;
import com.janine.pojo.QueryVo;
import com.janine.pojo.User;

import java.util.List;

public interface UserMapper {
    User getUserById(Integer id);
    List<User> getUserByUserName(String userName);
    void insertUser(User user);
    List<User> getUserByPojo(User user);
    List<User> getUserByIds(QueryVo queryVo);
    List<User> getUserOrderMap();
}
