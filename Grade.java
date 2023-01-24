import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
       /* if the average score >=90% =>Student grade = A
 if the average score >= 70% and <90% =>Student grade = B
        if the average score>=50% and <70% =>Student grade = C

        if the average score<50% =>Student grade = F*/
        double avg;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the mid term score");
        double midTerm = input.nextDouble();
        System.out.println("enter the quiz score");
        double quiz = input.nextDouble();
        System.out.println("enter the Final score");
        double Final = input.nextDouble();
        avg=(midTerm+quiz+Final)/3;
        if (avg>=90){
    System.out.println("grade A");
        } else if (avg>=70 && avg <90 ) {
            System.out.println("enter the grade B");
        } else if (avg>=50 && avg<70) {
            System.out.println("enter the grade C");
        }
        else if (avg<50 ) {
            System.out.println("enter the grade F");
        }


    }
}
