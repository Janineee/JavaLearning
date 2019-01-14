package com.janine.dao;

import com.janine.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    int checkUsername(String username);
    
    // mybatis在传递多个参数时需要用到@param注解
    User selectLogin(@Param("username") String username, @Param("password") String password);
}