import java.util.ArrayList;

public class CollectionJoin {
    public static void main(String[] args) {
        ArrayList<Integer> num1=new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        System.out.println("first array list : "+num1);
        ArrayList<Integer> num2=new ArrayList<Integer>();
        num2.add(6);
        num2.add(7);
        num2.add(8);
        num2.add(9);
        num2.add(10);
        System.out.println("second array list : "+num2);
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.addAll(num1);
        a.addAll(num2);
        System.out.println("after joining the two array list : "+a);

    }
}
