import java.util.ArrayList;

public class CollectionEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> num1=new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        System.out.println(" array list : "+num1);
        num1.removeAll(num1);
        System.out.println("after remove array list : "+num1);

    }
}
