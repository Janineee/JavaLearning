package springtx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize() {
        this.setDataSource(dataSource);
    }

    @Override
    public void outMoney(Integer from, Double money) {
        System.out.println("\n==================");
        System.out.println(this.getJdbcTemplate());
        System.out.println("==================\n");
        this.getJdbcTemplate().update("update account set balance = balance - ? where id =?", money, from);
    }

    @Override
    public void inMoney(Integer to, Double money) {
        this.getJdbcTemplate().update("update account set balance = balance + ? where id =?", money, to);
    }

}
