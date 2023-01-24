import java.util.Scanner;

public class StringInteger {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter number String");
        String str=input.nextLine();
        int result= Integer.parseInt(str);
        System.out.printf("The integer value is: %d",result);
       // System.out.printf("\n");

    }
}
