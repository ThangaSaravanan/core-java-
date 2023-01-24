import java.util.ArrayList;

public class ArrayTrim {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ball");
        list.add("Bat");
        list.add("Stump");
        list.add("Ground");
        list.add("Player");
        System.out.println("original array : "+list);
        System.out.println("lets trim to the size above .");
        list.trimToSize();
        System.out.println(list);

    }
}
