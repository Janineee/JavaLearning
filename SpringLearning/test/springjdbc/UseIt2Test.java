package springjdbc;

import janine.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;


public class UseIt2Test extends BaseTest {

    @Resource
    public UseIt2 useIt2;

    @Test
    public void useTemplate() {
        useIt2.useTemplate();
    }

    @Test
    public void select() {
        useIt2.select();
    }

    @Test
    public void select2() {
        useIt2.select2();
    }

    @Test
    public void select3() {
        System.out.println(useIt2.select3());
    }

    @Test
    public void select4() {
        for (User user : useIt2.select4())
            System.out.println(user);
    }
}