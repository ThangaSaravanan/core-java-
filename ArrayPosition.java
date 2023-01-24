import java.util.ArrayList;

public class ArrayPosition {
    public static void main(String[] args) {
        ArrayList<Integer> num1=new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        System.out.println("first array : "+num1);
        for (Integer e:num1){
            System.out.println(e);
        }
    }
}
