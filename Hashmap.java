import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        int a=1,b2,c=3;

       /* HashMap<String,Integer> list=new HashMap<String,Integer>();
        list.put("a",1);
        list.put("b",2);
        list.put("c",3);
        System.out.println(list.values());*/
        HashMap<String,String> list=new HashMap<String,String>();
        list.put("ball","bat");
        list.put("pencil","rubber");
        list.put("pen","paper");
        System.out.println(list);
        System.out.println(list.containsKey("pencil"));
        System.out.println(list.containsValue("pepper"));
        System.out.println(list.values());
    }
}
