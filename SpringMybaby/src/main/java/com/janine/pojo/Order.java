package com.janine.pojo;

import java.util.Date;

public class Order {
    private User user;
    private Integer id;
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;

    public Order() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Date getCreatetime() {
        return this.createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String toString() {
        return "Order [id=" + this.id + ", userId=" + this.userId + ", number=" + this.number + ", createtime=" + this.createtime + ", note=" + this.note + "]";
    }
}
