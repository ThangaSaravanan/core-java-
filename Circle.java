import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        int radius;
        double area;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        radius = input.nextInt();
        area=(radius*radius)*Math.PI;
        System.out.println("the radius of circle is:"+area);
       /* Scanner s= new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  area=(22*r*r)/7 ;
        System.out.println("Area of Circle is: " + area);*/

    }
}
