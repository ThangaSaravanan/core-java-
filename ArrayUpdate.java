import java.util.ArrayList;

public class ArrayUpdate {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ball");
        list.add("Bat");
        list.add("Stump");
        list.add("Player");
        System.out.println(list);
        list.add(3,"Ground");
        System.out.println(list);
    }
}
