import java.util.ArrayList;

public class CollectionInsert {
    public static void main(String[] args) {
        ArrayList <String> arr=new ArrayList<String>();
        arr.add("Ball");
        arr.add("bat");
        arr.add("stump");
        System.out.println(arr);
        arr.add(0,"player");
        System.out.println(arr);

    }
}
