import java.time.Year;
import java.util.Scanner;

public class YearLeap {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter the year");
        int year = input.nextInt();
        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));
        if (a&&(b||c)){
            System.out.println(year + " is a leap year");
        }
    else {
            System.out.println(year + " is a not a leap year");
        }

    }
}
