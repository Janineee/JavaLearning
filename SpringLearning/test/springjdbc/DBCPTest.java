package springjdbc;

import janine.BaseTest;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class DBCPTest extends BaseTest {
    @Resource
    DBCP dbcp;

    @Test
    public void useTemplate() {
        dbcp.useTemplate();
    }
}