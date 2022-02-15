import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){

        List list1 = new ArrayList();
        list1.add("test");

        List list2 = addNewList();
        List<?> list = new ArrayList<String>();
        list.get(0);

        List<? extends Number> l = new ArrayList<Number>();

    }

    private static List addNewList() {
        List list2 = new ArrayList<>();
        list2.add(24);
        return list2;
    }
}

class A implements  inA {}

class B extends A implements  inB {
    @Override
    public void doSmth() {

    }
}

interface  inA{
    //void doSmth();
}
interface  inB{
    void doSmth();
    default void doDefault(){
        System.out.println("hello");
    }
}
