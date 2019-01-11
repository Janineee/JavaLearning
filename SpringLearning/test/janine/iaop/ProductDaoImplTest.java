package janine.iaop;

import janine.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

// @RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration({"classpath:applicationContext.xml"})
public class ProductDaoImplTest extends BaseTest {

    @Resource
    private ProductDao productDao;

    @Test
    public void iaopTest() {
        // productDao.create();
        productDao.delete();
    }

}