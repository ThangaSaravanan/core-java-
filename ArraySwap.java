import java.util.ArrayList;
import java.util.Collections;

public class ArraySwap {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ball");
        list.add("Bat");
        list.add("Stump");
        list.add("Player");
        list.add("Ground");
        System.out.println("original array : "+list);
        Collections.swap(list,0,3);
        System.out.println("after swap array : "+list);
    }
}
