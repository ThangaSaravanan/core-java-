import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the first name");
        String fnName = input.nextLine();
        System.out.println("enter the second name");
        String secName = input.nextLine();
        System.out.println(fnName+secName);
    }
}
