package janinejdbc.abase;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Conn {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db1?serverTimezone=UTC";

    public static void main(String[] args) {

        try {
            // 1.注册驱动
            DriverManager.registerDriver(new Driver());

            // 2.建立连接
            // 参数1: 协议+访问的数据库
            Connection connection = DriverManager.getConnection(DB_URL, "root", "janine");

            // 3.创建statement，跟数据库打交道一定需要这个对象
            Statement statement = connection.createStatement();

            // 执行查询，得到结果
            String sql1 = "select * from user";
            ResultSet resultSet = statement.executeQuery(sql1);

            // 遍历循环每一条记录
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("id") + "\t" +
                                resultSet.getString("name") + " \t" +
                                resultSet.getString("sex"));
            }

            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
