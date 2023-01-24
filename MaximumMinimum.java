import java.util.Arrays;
import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter how many numbers you want to sum");
    int n= input.nextInt();
    int[] arr=new int[n];
    System.out.println("enter"+n+"numbers");
    for (int i=0;i<n;i++){
    System.out.println("enter the number"+(i+1)+":");
    arr[i]= input.nextInt();

    }
        System.out.println("original Array : "+ Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println("sorted array : "+Arrays.toString(arr));
    System.out.println("the large num in this array : "+arr[4]);
        System.out.println("the smallest num in this array : "+arr[0]);
    }
}
