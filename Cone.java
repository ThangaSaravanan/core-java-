import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the height of cone");
        double h= input.nextDouble();
        System.out.println("enter the radius of cone");
        double r= input.nextDouble();
        double pi=3.1415926535;
        double volume=pi*(r*r)*h/3;
        System.out.println("the volume of cone is : "+volume);
    }
}
