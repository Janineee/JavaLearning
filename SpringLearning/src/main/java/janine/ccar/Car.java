/**
 * 构造方法方式的属性注入
 */

package janine.ccar;

public class Car {
    private String name;
    private Double price;

    public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return "Car: " + name + ", price: " + price;
    }
}
