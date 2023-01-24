import java.util.Scanner;

public class Arithmetic {
    public static int sum(int a,int b){
      int  sum=(a+b);
      return sum;
    }
    public static int sub(int a,int b){
        int  sub=(a-b);
        return sub;
    }
    public static int multiply(int a,int b){
        int  multiply=(a*b);
        return multiply;
    }
    public static int divide(int a,int b){
        int  divide=(a/b);
        return divide;
    }
    public static int remainder(int a,int b){
        int remainder  =(a%b);
        return remainder;
    }
    static void printLine(){
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first value");
        int a= input.nextInt();
        System.out.println("enter the second value");
        int b= input.nextInt();
        printLine();
        System.out.println("sum of two values is:"+sum(a,b));
        printLine();
        System.out.println("sud of two values is:"+sub(a,b));
        printLine();
        System.out.println("multiplication of two values is:"+multiply(a,b));
        printLine();
        System.out.println("division of two values is:"+divide(a,b));
        printLine();
        System.out.println("remainder of two values is:"+remainder(a,b));
    }
}
