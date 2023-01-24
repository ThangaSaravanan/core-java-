import java.util.ArrayList;
import java.util.Collections;

public class CollectionShuffle {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Ball");
        arr.add("Bat");
        arr.add("Stump");
        arr.add("Player");
        System.out.println("before shuffle : "+arr);
        Collections.shuffle(arr);
        System.out.println("after shuffle : "+arr);
    }
}
