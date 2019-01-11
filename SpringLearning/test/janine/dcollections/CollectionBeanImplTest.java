package janine.dcollections;

import janine.eanno1.UserDAOImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

public class CollectionBeanImplTest {

    @Test
    public void toStringTest() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean.toString());
    }

    // @Test
    // public void toStringTest2() {
    //     ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
    //     UserDAOImpl collectionBean = (UserDAOImpl) applicationContext.getBean("testDao");
    //     System.out.println(collectionBean.toString());
    // }

}