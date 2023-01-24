import java.util.ArrayList;
import java.util.Arrays;

public class ListArray {
    public static void main(String[] args) {
        String[] arr={"ball","bat","stump","ground"};
        ArrayList<String>  list = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(list);
    }
}
