import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int n = in.nextInt();
        System.out.println("The sum of digit is " + (n));
       int i,sum=0;
        for (i=0;i<n;i++){
            sum=sum+i;
            System.out.println("the sum of the numbers is:"+sum);
        }

    }

    }


