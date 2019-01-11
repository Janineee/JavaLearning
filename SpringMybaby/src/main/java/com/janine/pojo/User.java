package com.janine.pojo;

import java.util.Date;
import java.util.List;

public class User {
    private List<Order> orderList;
    private Integer id;
    private String username;
    private String sex;
    private Date birthday;
    private String address;

    public User() {
    }

    public List<Order> getOrderList() {
        return this.orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "User [id=" + this.id + ", username=" + this.username + ", sex=" + this.sex + ", birthday=" + this.birthday + ", address=" + this.address + "]";
    }
}
