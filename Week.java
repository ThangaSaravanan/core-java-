import java.time.DayOfWeek;
import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        int day;
        Scanner input =new Scanner(System.in);
        System.out.println("enter the num 1to 7");
         day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("Saturday");

        }
        System.out.println("the day of the entered num is :" +day);
    }
}
