import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the height of the triangle");
        int height = input.nextInt();
        System.out.println("enter the width of the triangle");
        int width = input.nextInt();
        double area=(height*width)/2;
        System.out.println("the area or triangle : "+area);
    }
}
