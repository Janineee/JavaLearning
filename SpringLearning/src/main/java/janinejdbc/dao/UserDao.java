package janinejdbc.dao;

public interface UserDao {
    public void findAll();
    public void login(String username, String password);
    public void insert(String username, String password);
    public void delete(int id);
    public void delete(String username);
    public void update(int id);
    public void update(String username);
}
