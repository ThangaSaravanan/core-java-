import java.util.ArrayList;

public class CollectionRemove {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Ball");
        arr.add("bat");
        arr.add("stump");
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
    }

}
