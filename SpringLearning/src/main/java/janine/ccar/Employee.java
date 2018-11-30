/**
 * set方式注入对象类型的属性
 */

package janine.ccar;

public class Employee {
    private String name;
    private Car2 car2;

    public void setName(String name) {
        this.name = name;
    }

    public void setCar2(Car2 car2) {
        this.car2 = car2;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", " + car2;
    }
}
