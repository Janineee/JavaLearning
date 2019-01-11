package springjdbc;

import janine.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class C3P0Test extends BaseTest {

    @Resource
    private C3P0 c3P0;

    @Test
    public void useTemplate() {
        c3P0.useTemplate();
    }
}