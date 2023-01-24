import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the radius of circle");
        double pi=3.1415926535;
        int r = input.nextInt();
        double volume=4.0/3.0*pi*r*r*r;
        System.out.println("the volume of sphere is : " +volume);
    }
}
