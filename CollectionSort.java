import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Ball");
        arr.add("Stump");
        arr.add("Bat");
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println("sorted list : "+arr);
    }
}
