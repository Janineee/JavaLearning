package janine.gxmlanno;

import javax.annotation.Resource;

public class ProductService {

    @Resource(name = "productDao1")
    private ProductDao productDao;

    @Resource
    private OrderDao orderDao;

    public void save(){
        System.out.println("product service -- save");
    }
}
