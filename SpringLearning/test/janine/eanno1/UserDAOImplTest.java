package janine.eanno1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

public class UserDAOImplTest {

    @Test
    public void save() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
        UserDAO userDAO = (UserDAO)applicationContext.getBean("userDao");
        userDAO.save();
    }
}