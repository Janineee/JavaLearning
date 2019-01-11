package janine.eanno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    // @Autowired
    // @Qualifier(value = "userDao")
    // private UserDAO userDAO;

    // 上面俩注解的替代品，一般都用这个
    @Resource(name = "userDao")
    private UserDAO userDAO;

    @Override
    public void save() {
        userDAO.save();
        System.out.println("It's service:)");
    }
}
