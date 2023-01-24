import java.util.Scanner;

public class LeapYear {
    public static boolean checkYear(int year){
        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = ((year % 100 == 0) && (year % 400 == 0));

        return a && (b || c);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the year");
        int year= input.nextInt();
        System.out.println("the entered year is : "+checkYear(year));
    }

}
