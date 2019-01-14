package com.janine.service;

import com.janine.common.ServerResponse;
import com.janine.pojo.User;

public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
