package com.janine.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.janine.pojo.User;

import java.io.Serializable;

// 保证序列化json时，如果是null的对象，key也会消失
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerResponse<T> implements Serializable {
    private int status;
    private String msg;
    private T data;
    
    private ServerResponse(int status) {
        this.status = status;
    }
    
    private ServerResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }
    
    private ServerResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    
    private ServerResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    
    // 不会显示在序列化后的json结果中
    @JsonIgnore
    public boolean isSuccess() {
        return this.status == ResponseCode.SUCCESS.getCode();
    }
    
    public int getStatus() {
        return status;
    }
    
    public String getMsg() {
        return msg;
    }
    
    public T getData() {
        return data;
    }
    
    
    public static <T> ServerResponse<T> createBySucess(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }
    
    public static <T> ServerResponse<T> createBySucessMessage(String msg){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg);
    }
    
    public static <T> ServerResponse<T> createBySucess(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), data);
    }
    
    public static <T> ServerResponse<T> createBySucess(String msg, T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg, data);
    }
    
    public ServerResponse<T> createByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode());
    }
    
    public static <T> ServerResponse<T> createByErrorMessage(String errorMessage){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), errorMessage);
    }
    
    public static <T> ServerResponse<T> createByErrorCodeMessage(int errorCode, String errorMessage){
        return new ServerResponse<T>(errorCode, errorMessage);
    }
    
}
