import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the radius of cylinder");
     double r= input.nextInt();
        System.out.println("enter the height of cylinder");
        double h= input.nextInt();
        double pi=3.1415926535;
      double volume=pi*(r*r)*h;
      System.out.println("the volume of cylinder : " +volume);
    }
}
