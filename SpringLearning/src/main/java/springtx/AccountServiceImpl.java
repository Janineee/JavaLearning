package springtx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    // @Resource
    // private TransactionTemplate transactionTemplate;

    // @Override
    // // 编程式事务管理，需要自己手动编写代码
    // public void transfer(final Integer from, final Integer to, final Double money) {
    //     transactionTemplate.execute(new TransactionCallbackWithoutResult() {
    //         @Override
    //         protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
    //             accountDao.outMoney(from, money);
    //             accountDao.inMoney(to, money);
    //
    //         }
    //     });
    // }
    public void transfer(final Integer from, final Integer to, final Double money) {
        accountDao.outMoney(from, money);
        accountDao.inMoney(to, money);
    }
}
