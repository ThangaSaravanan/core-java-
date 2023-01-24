import java.util.Scanner;
public class VowelConstant {
    public static void main(String[] args) {

        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the character");
        ch = input.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " : is vowel");
                break;
            default:
                System.out.println(ch + " : is constant");

        }
    }

}