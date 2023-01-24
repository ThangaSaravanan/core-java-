import java.util.Scanner;

public class MethodAverage {
    public static double average(double a,double b,double c){

        double avg;
        return  avg=(a+b+c)/3;

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the first num");
       double  a=input.nextInt();
        System.out.println("enter the second num");
        double b=input.nextInt();
        System.out.println("enter the third num");
         double c=input.nextInt();
    System.out.println("the avg value of three value : " +average(a,b,c));
    }
}
