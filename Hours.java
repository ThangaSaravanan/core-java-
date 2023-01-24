import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the seconds");
        int seconds= input.nextInt();
        int a =seconds % 60;
        int b =seconds /60;
        int c = b % 60;
         b= b /60;
         System.out.println(b+":"+c+":"+a);
    }
}
