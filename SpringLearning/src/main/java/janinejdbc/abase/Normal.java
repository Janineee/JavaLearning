package janinejdbc.abase;

import com.mysql.cj.jdbc.Driver;
import janinejdbc.util.JDBCUtil;

import java.sql.*;

public class Normal {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = JDBCUtil.getConnection();

            // 3.创建statement，跟数据库打交道一定需要这个对象
            statement = connection.createStatement();

            // 执行查询，得到结果
            String sql1 = "select * from user";
            resultSet = statement.executeQuery(sql1);

            // 遍历循环每一条记录
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("id") + "\t" +
                                resultSet.getString("name") + " \t" +
                                resultSet.getString("sex"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.release(resultSet, statement, connection);
        }
    }
}
