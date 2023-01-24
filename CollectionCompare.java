import java.util.ArrayList;

public class CollectionCompare {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Ball");
        arr.add("Stump");
        arr.add("Bat");
        arr.add("players");
        arr.add("ground");
        System.out.println(arr);
        ArrayList<String> arr2=new ArrayList<String>();
        arr2.add("Ball");
        arr2.add("Stump");
        arr2.add("Bat");
        System.out.println(arr2);
        ArrayList<String> arr3 =new ArrayList<String>();
     for (String e:arr)

        arr3.add(arr2.contains(e) ? "Yes" : "No");
        System.out.println(arr3);
    }
}
