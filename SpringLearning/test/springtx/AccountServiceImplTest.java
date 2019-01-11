package springtx;

import janine.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class AccountServiceImplTest extends BaseTest {

    @Resource
    private AccountService accountService;
    @Resource
    AccountDao accountDao;

    @Test
    public void transfer() {
        accountService.transfer(1, 2, 888.88);
        // System.out.println("123");
    }
}