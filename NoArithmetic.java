import java.util.Scanner;

public class NoArithmetic {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the first num");
        int a= input.nextInt();
    System.out.println("enter the second num");
     int b= input.nextInt();
     while (b!=0){
         int c=a & b;
         a=a ^ b;
         b=c << 1;
     }
     System.out.println("sum :"+a);
    // System.out.println("\n");
    }
}
