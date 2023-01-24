import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the diagonal1 of rhombus");
        int d1= input.nextInt();
        System.out.println("enter the diagonal2 of rhombus");
        int d2= input.nextInt();
        double area= (d1*d2)/2;
        System.out.println("area of rhombus : "+area);

    }
}
