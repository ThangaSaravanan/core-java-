import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the num");
        int num1 = input.nextInt();
        System.out.println("enter the second num");
        int num2 = input.nextInt();
        System.out.println("enter the third num");
        int num3 = input.nextInt();
        if (num1==num2&&num1==num3){
            System.out.println("the num is equal");
        }
        else
            System.out.println("the num is not equal");
    }
}
