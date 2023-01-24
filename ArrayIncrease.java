import java.util.ArrayList;

public class ArrayIncrease {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>(4);
        arr.add("Black");
        arr.add("White");
        arr.add("Blue");
        arr.add("Green");
        System.out.println("original array : "+arr);
        arr.ensureCapacity(2);
        arr.add("yellow");
        arr.add("pink");
        System.out.println(arr);
    }
}
