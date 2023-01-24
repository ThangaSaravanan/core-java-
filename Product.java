import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the first num");
        int a = input.nextInt();
        System.out.println("enter the second num");
        int b = input.nextInt();
        int product=(a*b);
        System.out.println("the product of input numbers is :"+product);
    }
}
