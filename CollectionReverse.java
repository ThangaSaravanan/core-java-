import java.util.ArrayList;
import java.util.Collections;

public class CollectionReverse {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Ball");
        arr.add("Stump");
        arr.add("Bat");
        System.out.println("before reverse : "+arr);
        Collections.reverse(arr);
        System.out.println("after reverse : "+arr);

    }
}
