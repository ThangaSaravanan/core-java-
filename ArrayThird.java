import java.util.ArrayList;

public class ArrayThird {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ball");
        list.add("Bat");
        list.add("Stump");
        list.add("Ground");
        list.add("Player");
        System.out.println("original array : "+list);
        list.remove(3);
        System.out.println("after remove : "+list);
    }
}
