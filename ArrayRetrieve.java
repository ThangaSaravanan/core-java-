import java.util.ArrayList;

public class ArrayRetrieve {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Black");
        arr.add("White");
        arr.add("Blue");
        arr.add("Green");
        System.out.println(arr);
        String element=arr.get(0);
        System.out.println(element);
    }
}
