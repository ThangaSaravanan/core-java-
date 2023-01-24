import java.util.Scanner;

public class Parlla {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the diagnoal1 of Parallelogram");
        int d1 = input.nextInt();
        System.out.println("enter the diagnoal2 of Parallelogram");
        int d2 = input.nextInt();
        double area=(d1*d2);
        System.out.println("the area of Parallelogram : "+area);
    }
}
