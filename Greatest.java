import java.util.Arrays;
import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter how many numbers to sum");
        int num = input.nextInt();
        int[]arr=new int[num];
        System.out.println("Enter the "+num+" numbers ");
        for (int i=0;i<num;i++){

            System.out.println("Enter  number  "+(i+1));
            arr[i]=input.nextInt();
        }
        System.out.println("original array :"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted array :"+Arrays.toString(arr));

        System.out.println("the greatest value of given array is : "+arr[2]);



    }
}
