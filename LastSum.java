import java.util.Scanner;

public class LastSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the integers");
        int num= input.nextInt();
        int sum=0;
        while (num>0){
            int a=num%10;
            sum=sum+a;
            num=num/10;
        }
        System.out.println("the sum of the given integer is: " + sum);
        }
    }

