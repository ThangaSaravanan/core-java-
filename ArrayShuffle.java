import java.util.ArrayList;
import java.util.Collections;

public class ArrayShuffle {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        System.out.println("original array : "+num);
        Collections.shuffle(num);
        System.out.println("after shuffle array : "+num);
    }
}
