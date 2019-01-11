package janine.eanno1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// 相当于<bean id="userDao" class="janine.eanno1.UserDAOImpl"></bean>
// @Component("userDao")
@Repository("userDao")
public class UserDAOImpl implements UserDAO {

    // 属性如果有set方法，需要将属性注入的注解添加到set方法
    // 如果没有，将注解添加到属性上即可
    @Value("Doge")
    private String name;

    // @Value("Doge")
    // public void setName(String name) {
    //     this.name = name;
    // }

    @Override
    public void save() {
        System.out.println("DAO save running.." + name);
    }
}
