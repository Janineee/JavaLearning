package com.janine.common;

public class Const {
    
    public static final String CURRENT_USER = "currentUser";
    
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    
    // 用枚举类显得过于繁重，用内部接口来代替
    public interface Role {
        int ROLE_CUSTOMER = 0;
        int ROLE_ADMIN = 1;
    }
}
