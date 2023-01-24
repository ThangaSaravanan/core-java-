import java.util.Scanner;

public class AverageValue {


    public static void main(String[] args) {
       int i,sum = 0,n ;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the 5 number : " );
        for (i=0;i<5;i++){
            n=input.nextInt();
             sum +=n;
        }
        double average =sum/5;
    System.out.println("the sum of num is:"+sum);
        System.out.println("the aver of num is:"+average);


}


        }




