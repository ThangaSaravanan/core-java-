import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the num to find factorial");
        int n = input.nextInt();
        int i,fact=1;
        for (i=1;i<=n;i++){
            fact=fact*i;
          System.out.println("the factorial of given num : "+fact);
        }
    }
}
