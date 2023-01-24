import java.util.Scanner;

public class CubeNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the term");
        int n = input.nextInt();
        for (int i=1;i<=n;i++){
          System.out.println("the cube of"+i+"is :"+(i*i*i));
        }
    }
}
