import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the first num");
    int num1= input.nextInt();
        System.out.println("enter the second num");
        int num2= input.nextInt();
        System.out.println("enter the third num");
        int num3= input.nextInt();
        if (num1>num2&num2>num3){
            System.out.println("the num is decreasing order");
        } else if (num1<num2&num2<num3) {
            System.out.println("the num in increasing order ");
        }
        else
            System.out.println("the num neither increasing or decreasing");
    }
}
