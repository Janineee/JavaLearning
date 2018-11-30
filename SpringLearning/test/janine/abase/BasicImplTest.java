package janine.abase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BasicImplTest {

    @Test
    public void save() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
        Basic basic = (Basic)applicationContext.getBean("bean_a");
        basic.save();
    }
}