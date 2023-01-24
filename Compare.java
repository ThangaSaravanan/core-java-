import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first num");
        int num = input.nextInt();
        System.out.println("enter the second num");
        int num2 = input.nextInt();
        if (num == num2) {
            System.out.printf("%d == %d\n", num, num2);
        }
        if (num <= num2) {
            System.out.printf("%d <= %d\n", num, num2);
        }
        if (num >= num2) {
            System.out.printf("%d >= %d\n", num, num2);
        }
        if (num != num2) {
            System.out.printf("%d != %d\n", num, num2);
        }
        if (num < num2) {
            System.out.printf("%d < %d\n", num, num2);
        }
        if (num > num2) {
            System.out.printf("%d > %d\n", num, num2);
        }
    }

}

