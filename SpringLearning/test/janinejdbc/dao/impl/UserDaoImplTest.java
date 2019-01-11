package janinejdbc.dao.impl;

import janinejdbc.dao.UserDao;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    @Test
    public void findAll() {
        UserDao userDao = new UserDaoImpl();
        userDao.findAll();
    }

    @Test
    public void login() {
        UserDao userDao = new UserDaoImpl();
        userDao.login("janine", "10086");
        userDao.login("janine", "janine");
        userDao.login("doge", "doge");
    }

    @Test
    public void insert() {
        UserDao userDao = new UserDaoImpl();
        userDao.insert("mypl", "pwd1");
        userDao.insert("impl", "dao");
        userDao.insert("魔鬼", "天使");
    }


    @Test
    public void delete() {
        UserDao userDao = new UserDaoImpl();
        userDao.delete(1);
    }

    @Test
    public void delete1() {
        UserDao userDao = new UserDaoImpl();
        userDao.delete("魔鬼");
    }

    @Test
    public void update() {
    }

    @Test
    public void update1() {
    }
}