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
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
        
        // 校验加密过的密码
        String md5Password = MD5Util.MD5EncodeUtf8(password);
        
        User user = userMapper.selectLogin(username, password);
        if (user == null) {
            return ServerResponse.createByErrorMessage("密码错误");
        }
        
        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySucess("登录成功~", user);
    }
    
    @Override
    public ServerResponse<String> register(User user) {
        // 用户名校验
        ServerResponse validResponse = this.checkValid(user.getUsername(), Const.USERNAME);
        if (!validResponse.isSuccess()) {
            return validResponse;
        }
        
        // email校验
        validResponse = this.checkValid(user.getUsername(), Const.EMAIL);
        if (!validResponse.isSuccess()) {
            return validResponse;
        }
        
        // 设置权限等级
        user.setRole(Const.Role.ROLE_CUSTOMER);
        
        // md5加密
        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        
        if (userMapper.insert(user) == 0) {
            return ServerResponse.createByErrorMessage("注册失败！");
        }
        
        return ServerResponse.createBySucessMessage("注册成功~");
    }
    
    // 校验
    public ServerResponse<String> checkValid(String str, String type) {
        if (StringUtils.isNoneBlank(type)) {
            // 开始校验
            if (Const.USERNAME.equals(type)) {
                int resultCount = userMapper.checkUsername(str);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("用户名已存在");
                }
            }
            if (Const.EMAIL.equals(type)) {
                int resultCount = userMapper.checkEmail(type);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("email已存在");
                }
            }
            
        } else {
            return ServerResponse.createByErrorMessage("参数错误");
        }
        
        return ServerResponse.createByErrorMessage("校验成功");
    }
    
    
}
