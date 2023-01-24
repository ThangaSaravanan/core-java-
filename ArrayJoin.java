import java.util.ArrayList;

public class ArrayJoin {
    public static void main(String[] args) {
        ArrayList<Integer> num1=new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        System.out.println("first array : "+num1);
        ArrayList<Integer> num2=new ArrayList<Integer>();
        num2.add(6);
        num2.add(7);
        num2.add(8);
        num2.add(9);
        num2.add(10);
        System.out.println("second array : "+num2);
        ArrayList<Integer> num3=new ArrayList<Integer>();
        num3.addAll(num1);
        num3.addAll(num2);
        System.out.println("join array : "+num3);
    }
}
