import java.util.ArrayList;
import java.util.Collections;

public class CollectionSwap {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Ball");
        arr.add("Stump");
        arr.add("Bat");
        arr.add("players");
        arr.add("ground");
        System.out.println("before swap : "+arr);
        Collections.swap(arr,1,2);
        System.out.println("after swap : "+arr);
    }
}
