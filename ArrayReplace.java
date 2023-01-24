import java.util.ArrayList;
import java.util.Collections;

public class ArrayReplace {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(5);
        System.out.println("original array : "+num);
        num.set(3,4);
        System.out.println("new array : "+num);


    }
}
