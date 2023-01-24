import java.util.Scanner;

public class Prism {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the height of the prism");
        int h = input.nextInt();
        System.out.println("enter the base of the prism");
        int b = input.nextInt();
        double area=(h*b);
        System.out.println("the area of prism : "+area);
    }
}
