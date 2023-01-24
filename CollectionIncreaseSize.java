import java.util.ArrayList;

public class CollectionIncreaseSize {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Ball");
        arr.add("Stump");
        arr.add("Bat");
        System.out.println("before increase : "+arr);
       arr.ensureCapacity(5);
        arr.add("player");
        arr.add("ground");
        System.out.println("after increase : "+arr);
    }
}
