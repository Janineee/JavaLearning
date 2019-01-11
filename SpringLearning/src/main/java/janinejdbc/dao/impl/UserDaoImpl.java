package janinejdbc.dao.impl;

import janinejdbc.dao.UserDao;
import janinejdbc.util.JDBCUtil;

import java.sql.*;

public class UserDaoImpl implements UserDao {

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;


    @Override
    public void findAll() {
        connection = JDBCUtil.getConnection();

        String sql = "select * from user";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("id") + "\t" +
                                resultSet.getString("name") + " \t" +
                                resultSet.getString("sex")
                );
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.release(resultSet, statement, connection);
        }
    }

    @Override
    public void login(String username, String password) {
        connection = JDBCUtil.getConnection();
        String sql = "select * from login where username=? and password=?";
        try {
            // 预先对sql语句执行语法的校验，？对应的内容不管传递什么进来都把它看成字符串
            preparedStatement = connection.prepareStatement(sql);
            // ？对应的索引从1开始
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("登录成功~");
            }
            else {
                System.out.println("登录失败！");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.release(resultSet, preparedStatement, connection);
        }
    }

    @Override
    public void insert(String username, String password) {
        connection = JDBCUtil.getConnection();
        String sql = "insert into login values (null, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            int result = preparedStatement.executeUpdate();
            if (result > 0)
                System.out.println("添加成功~");
            else
                System.out.println("添加失败~");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.release(resultSet, preparedStatement, connection);
        }


    }

    @Override
    public void delete(int id) {
        connection = JDBCUtil.getConnection();
        String sql = "delete from login where id=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            if (preparedStatement.executeUpdate() > 0)
                System.out.println("删除成功~");
            else
                System.out.println("删除失败！");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.release(resultSet, preparedStatement, connection);
        }
    }

    @Override
    public void delete(String username) {
        connection = JDBCUtil.getConnection();
        String sql = "delete from login where username=?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            if (preparedStatement.executeUpdate() > 0)
                System.out.println("删除成功~");
            else
                System.out.println("删除失败！");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.release(resultSet, preparedStatement, connection);
        }
    }

    @Override
    public void update(int id) {

    }

    @Override
    public void update(String username) {

    }

}
