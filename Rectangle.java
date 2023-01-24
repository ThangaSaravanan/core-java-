import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length of the rectangle");
        int length = input.nextInt();
        System.out.println("enter the length of the rectangle");
        int breadth = input.nextInt();
        int area=(length*breadth);
        System.out.println("the area or rectangle : "+area);
    }
}
