package janine.ccar;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.toString());
    }

    @Test
    public void testP() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee2");
        System.out.println(employee.toString());
    }

    @Test
    public void testSpEL() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employeeSpEL");
        System.out.println(employee.toString());
    }

    @Test
    public void testSpEL2() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/applicationContext.xml");
        Car2 car3 = (Car2) applicationContext.getBean("car3");
        System.out.println(car3.toString());
    }
}