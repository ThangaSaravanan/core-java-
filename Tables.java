import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the num of terms");
        int n = input.nextInt();

        for (int i=0; i<=n;i++){
            System.out.println(n+" X "+i+" = " +n*i);

        }
    }
}
