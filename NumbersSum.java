import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter how many numbers to sum");
        int n = input.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the "+n+" numbers ");
        for (int i=0;i<n;i++){

                System.out.println("Enter  number  "+(i+1)+":");
                arr[i]=input.nextInt();
            }
            for(int i=0;i<n;i++) {
                int sum = arr[i];

                System.out.println("sum of " + n + " numbers is =" + sum);
            }
        }
    }

