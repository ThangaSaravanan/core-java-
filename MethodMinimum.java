import java.util.Scanner;

public class MethodMinimum {
    public static int smallest(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the first num");
        int  a=input.nextInt();
        System.out.println("enter the second num");
        int b=input.nextInt();
        System.out.println("enter the third num");
        int c=input.nextInt();
        System.out.println("Minimum value of three numbers : "+smallest(a,b,c));
    }
}
