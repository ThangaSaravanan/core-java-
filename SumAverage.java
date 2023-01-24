import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter how many numbers you want to sum");
        int n = input.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the"+n+"numbers");
         for (int i=0;i<n;i++){
             System.out.println("enter the numbers "+(i+1));
             arr[i]=input.nextInt();
         }
         int sum=0;
          for (int i=0;i<n;i++){
               sum= sum+arr[i];
               System.out.println("the sum of the given num is : "+sum);
          }
          int avg;
          avg =sum/n;
        System.out.println("the avg of the given num is : "+avg);



    }
}
