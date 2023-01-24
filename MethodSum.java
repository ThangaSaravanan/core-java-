import java.util.Scanner;

public class MethodSum {
    public static int sum(int a){
        int sum=0;
        while(a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int a= input.nextInt();
        System.out.println(sum(a));
    }

}
