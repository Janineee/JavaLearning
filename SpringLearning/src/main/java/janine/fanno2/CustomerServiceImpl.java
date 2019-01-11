package janine.fanno2;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
    @Override
    // 相当于init-method
    @PostConstruct
    public void init() {
        System.out.println("CustomerService--init");
    }

    @Override
    public void save() {
        System.out.println("CustomerService--save~~~~~~");
    }

    @Override
    // 相当于destroy-method
    @PreDestroy
    public void destroy() {
        System.out.println("CustomerService--destroy");
    }
}
