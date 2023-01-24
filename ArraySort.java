import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Black");
        arr.add("White");
        arr.add("Blue");
        arr.add("Green");
        arr.add("Brown");
        System.out.println("original array : "+ arr);
        Collections.sort(arr);
        System.out.println("sorted array : "+arr);
    }
}
