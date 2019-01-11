package springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class C3P0 {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public void useTemplate() {
        jdbcTemplate.update("insert into login values (null, ?, ?)", "whom", "belongto");
    }

}
