package janine.jaopanno;

import janine.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class JanineDaoTest extends BaseTest {

    @Resource
    private JanineDao janineDao;

    @Test
    public void save() {
        janineDao.save();
    }
}