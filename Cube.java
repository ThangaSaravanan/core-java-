import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the side of cube");
        double side= input.nextDouble();
        double area=4*side*side;
        System.out.println("the surface area of cube : "+area);
    }
}
