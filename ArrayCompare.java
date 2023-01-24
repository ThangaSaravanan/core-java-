import java.util.ArrayList;

public class ArrayCompare {
    public static void main(String[] args) {
        ArrayList<Integer> num1=new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        System.out.println("first array : "+num1);
        ArrayList<Integer> num2=new ArrayList<Integer>();
        num2.add(6);
        num2.add(7);
        num2.add(8);
        num2.add(9);
        num2.add(10);
        System.out.println("second array : "+num2);
      if (num1.equals(num2)){
           System.out.println("the two array lists are equal .");
       }
       else
           System.out.println("the two array lists are not equal .");
      /*  if (num.containsAll(num1) && num1.containsAll(num)) {
            System.out.println("The lists are equal.");
        } else {
            System.out.println("The lists are not equal.");
        }*/
       // ArrayList<Integer> num3=new ArrayList<Integer>();
    //    for (Integer e : num1)
         //   num3.add(num2.contains(e) ? "Yes" : "No");

    }
}
