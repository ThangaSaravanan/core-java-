import java.util.ArrayList;
import java.util.List;

public class ArrayExtract {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println("original array : "+num);
        List<Integer> subList = num.subList(0, 3);
        System.out.println("new array : "+subList);



    }
}
