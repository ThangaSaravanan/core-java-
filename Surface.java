import java.util.Scanner;

public class Surface {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the height of cuboid");
        int h= input.nextInt();
        System.out.println("enter the length of cuboid");
        int l= input.nextInt();
        System.out.println("enter the breadth of cuboid");
        int b= input.nextInt();
        double area=(2*((l*h)+(l*b)+(h*b)));
        System.out.println("the surface area of cuboid : " +area);

    }
}
