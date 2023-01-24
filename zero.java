import java.util.Scanner;

public class zero {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number");
        int num = input.nextInt();
        if (num>0){
            System.out.println("the num is positive");
        } else if (num<0) {

            System.out.println("the num is negative");
        }
        else
            System.out.println("num is zero");
    }
}
