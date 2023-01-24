import java.util.ArrayList;

public class ArrayEmptyNot {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println("original array : "+num);
       /* if (num.size()==0){
                System.out.println("The list is empty.");
            } else {
                System.out.println("The list is not empty.");
            }*/
        if (num.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }
        }
    }

