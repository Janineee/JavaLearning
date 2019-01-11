package springtx;

public interface AccountDao {
    public void outMoney(Integer from, Double money);
    public void inMoney(Integer to, Double money);
}
