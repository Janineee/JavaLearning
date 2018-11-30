package janine.ccar;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

public class Car2Test {

    @Test
    public void test() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
        Car2 car2 = (Car2) applicationContext.getBean("car2");
        System.out.println(car2);
    }
}