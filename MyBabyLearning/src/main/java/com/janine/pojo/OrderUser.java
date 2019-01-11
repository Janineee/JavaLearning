package com.janine.pojo;

public class OrderUser extends Order{
    private String username;
    private String address;

    @Override
    public Integer getUserId() {
        return super.getUserId();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public String toString() {
        return "OrderUser{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
