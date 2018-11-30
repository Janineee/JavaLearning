package janine.eanno1;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("testDao")
public class UserDAOImpl implements UserDAO {

    @Override
    public void save() {
        System.out.println("DAO save running..");
    }
}
