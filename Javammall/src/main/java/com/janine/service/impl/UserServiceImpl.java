package com.janine.service.impl;

import com.janine.common.ServerResponse;
import com.janine.dao.UserMapper;
import com.janine.pojo.User;
import com.janine.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iUserService")
public class UserServiceImpl implements IUserService {
    
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public ServerResponse<User> login(String username, String password) {
        int resultCount = userMapper.checkUsername(username);
        if (resultCount == 0){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
    
        // TODO 密码登录md5
        
        
        User user = userMapper.selectLogin(username, password);
        if (user == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        
        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySucess("登录成功~", user);
    }
}
