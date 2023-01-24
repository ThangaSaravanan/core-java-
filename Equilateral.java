import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the side of the equilateral");
        double side = input.nextInt();
    double area=(Math.sqrt(3)/4)*(side*side);
    System.out.println("area of equilateral triangle : "+area);
    }
}
