package janine.haop;


public class UserDaoImpl implements UserDao {
    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public void delete() {
        System.out.println("selete");
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
