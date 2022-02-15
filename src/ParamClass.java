import java.util.ArrayList;
import java.util.List;

public class ParamClass {
    public static void main(String[] args) {
        List<Car> list = new ArrayList();
        list.add(new Car());
        list.add(new Car());
        list.add(new Car());
        list.add(new Car());
        System.out.println(list.toString());
        Test t = new Test();
    }
}

class Car{}

class Bus extends Car{}

