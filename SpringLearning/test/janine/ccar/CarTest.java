package janine.ccar;

import janine.bcus.CustomerDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }
}