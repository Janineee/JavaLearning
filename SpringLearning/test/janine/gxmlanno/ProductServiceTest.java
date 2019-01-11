/**
 * XML和注解整合开发
 *
 */

package janine.gxmlanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;

public class ProductServiceTest {

    @Test
    public void save() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/res/applicationContext.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productService");
        productService.save();
    }
}