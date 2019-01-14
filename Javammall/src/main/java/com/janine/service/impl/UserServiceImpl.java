package com.janine.service.impl;

import com.janine.common.Const;
import com.janine.common.ServerResponse;
import com.janine.dao.UserMapper;
import com.janine.pojo.User;
import com.janine.service.IUserService;
import com.janine.util.MD5Util;
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
    
        // 校验加密过的密码
        String md5Password = MD5Util.MD5EncodeUtf8(password);
        
        User user = userMapper.selectLogin(username, password);
        if (user == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        
        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySucess("登录成功~", user);
    }
    
    @Override
    public ServerResponse<String> register(User user) {
        int resultCount = userMapper.checkUsername(user.getUsername());
        if (resultCount > 0){
            return ServerResponse.createByErrorMessage("用户名已存在");
        }
        
        resultCount = userMapper.checkEmail(user.getEmail());
        if (resultCount > 0){
            return ServerResponse.createByErrorMessage("email已存在");
        }
        // 设置权限等级
        user.setRole(Const.Role.ROLE_CUSTOMER);
        
        // md5加密
        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        
        resultCount = userMapper.insert(user);
        if (resultCount == 0){
            return ServerResponse.createByErrorMessage("注册失败！");
        }
        
        return ServerResponse.createBySucessMessage("注册成功~");
    }
    
    
}
