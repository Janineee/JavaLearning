/**
 * init & destroy 配置
 */

package janine.bcus;

public class CustomerDAOImpl implements CustomerDAO{

    public void setup(){
        System.out.println("初始化");
    }

    @Override
    public void save(){
        System.out.println("save~");
    }

    public void destroy(){
        System.out.println("销毁");
    }
}
