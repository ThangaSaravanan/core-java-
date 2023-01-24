import java.util.Scanner;

public class SurfaceCylinder {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the height of cylinder");
        double h= input.nextDouble();
        System.out.println("enter the radius of cylinder");
        double r= input.nextDouble();
        double area=(((2*22*r) /7 )*(r+h));
        System.out.println("the surface area of cylinder : "+area);
    }
}
