package janine.bcus;

import janine.abase.Basic;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

public class CustomerDAOImplTest {

    @Test
    public void save() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
        CustomerDAO customerDAO = (CustomerDAO) applicationContext.getBean("bean_b");
        customerDAO.save();

        // 生命周期结束就销毁
        // 如果是单例创建，运行完就销毁
        ((FileSystemXmlApplicationContext) applicationContext).close();
    }
}