package com.janine.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        // 创建核心配置文件的输入流
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("SqlMapConfig");
            // 通过输入流创建xxx对象
            sqlSessionFactory = factoryBuilder.build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
