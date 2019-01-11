package springjdbc;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.security.auth.login.AccountException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

@Component
public class UseIt2 {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Resource
    private User user;

    // 增删改都一样
    public void useTemplate() {
        jdbcTemplate.update("insert into login values (null, ?, ?)", "cat", "candy");
    }

    // select
    public void select() {
        String name = jdbcTemplate.queryForObject("select username from login where id=?", String.class, 9);
        System.out.println(name);
    }

    // 统计查询，记录数量
    public void select2() {
        Long count = jdbcTemplate.queryForObject("select count(*) from login", Long.class);
        System.out.println(count);
    }

    // 封装到对象中
    public User select3() {
        user = jdbcTemplate.queryForObject("select * from login where id = ?", new MyRowMapper(), 9);
        return user;
    }

    public List<User> select4() {
        List<User> userList = jdbcTemplate.query("select * from login", new MyRowMapper());
        System.out.println(userList);
        // for (User user : userList)
        //     System.out.println(user);
        return userList;
    }

    class MyRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            /**
             * 这里注意不能使用注解，以后工具类相关的用注解，实体类什么的直接new
             */
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("username"));
            user.setRandProperty(new Random().nextInt(1000));
            return user;
        }
    }
}
