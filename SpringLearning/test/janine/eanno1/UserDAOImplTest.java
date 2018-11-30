package janine.eanno1;

import org.junit.Test;

import static org.junit.Assert.*;


public class UserDAOImplTest {

    @Test
    public void save0() {
        UserDAO userDAO = new UserDAOImpl();
        userDAO.save();
    }
}