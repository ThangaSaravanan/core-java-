import java.util.ArrayList;

public class ArrayIterate {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Black");
        arr.add("White");
        arr.add("Blue");
        arr.add("Green");
        for (String element:arr){
            System.out.println(element);
        }
    }
}
