package springjdbc;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DBCP {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public void useTemplate() {
        jdbcTemplate.update("insert into login values (null, ?, ?)", "cat", "candy");
    }

}
