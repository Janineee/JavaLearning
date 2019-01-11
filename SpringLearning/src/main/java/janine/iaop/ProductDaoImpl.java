package janine.iaop;

import org.springframework.stereotype.Component;

public class ProductDaoImpl implements ProductDao{

    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public String delete() {
        // 测试异常抛出通知的搞出异常代码
        // int err1 = 1;
        // int err0 = 0;
        // int err = err1/err0;
        System.out.println("delete");
        return "简宁小同学";
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void select() {
        System.out.println("select");
    }
}
