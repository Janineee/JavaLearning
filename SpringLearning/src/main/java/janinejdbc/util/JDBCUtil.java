package janinejdbc.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {

    static String JDBC_DRIVER = null;
    static String DB_URL = null;
    static String DB_USER = null;
    static String DB_PWD = null;

    public static void main(String[] args) {
        new JDBCUtil();
    }

    static {
        // 创建属性配置对象
        Properties properties = new Properties();
        try {
            // 导入输入流
            // InputStream inputStream = new FileInputStream("jdbc.properties");
            // 使用类加载器获取资源文件
            // InputStream inputStream = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            ClassLoader classLoader = JDBCUtil.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("jdbc.properties");
            properties.load(inputStream);

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // 读取属性
        JDBC_DRIVER = properties.getProperty("jdbc_driver");
        DB_URL = properties.getProperty("db_url");
        DB_USER = properties.getProperty("db_user");
        DB_PWD = properties.getProperty("db_password");
    }

    // public static void

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // 1.注册驱动
            // 可以不写了
            // DriverManager.registerDriver(new Driver());  // Driver()里有静态代码块，直接就注册了驱动会二次注册
            // Class.forName(JDBC_DRIVER);

            // 2.建立连接
            // 参数1: 协议+访问的数据库
            connection = DriverManager.getConnection(DB_URL, "root", "janine");
        }
        // catch (ClassNotFoundException e) {
        //     e.printStackTrace();
        // }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 释放资源
     *
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void release(ResultSet resultSet, Statement statement, Connection connection) {
        closeResultSet(resultSet);
        closeStatement(statement);
        closeConnection(connection);
    }

    public static void release(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection){
        closeResultSet(resultSet);
        closePreparedStatement(preparedStatement);
        closeConnection(connection);
    }

    private static void closeResultSet(ResultSet resultSet) {
        if (resultSet == null) {
            return;
        }
        try {
            resultSet.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void closeStatement(Statement statement) {
        if (statement == null) {
            return;
        }
        try {
            statement.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void closeConnection(Connection connection) {
        if (connection == null) {
            return;
        }
        try {
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void closePreparedStatement(PreparedStatement preparedStatement) {
        try {
            preparedStatement.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
