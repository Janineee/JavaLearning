package springjdbc;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer id;
    private String name;
    private Integer randProperty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRandProperty() {
        return randProperty;
    }

    public void setRandProperty(Integer randProperty) {
        this.randProperty = randProperty;
    }

    @Override
    public String toString() {
        return Integer.toString(id) + "\t" + name + "\t" + Integer.toString(randProperty);
    }
}
