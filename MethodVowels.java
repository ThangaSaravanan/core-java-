import java.util.Scanner;

public class MethodVowels {
    public static int vowels(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {


                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the name");
        String name= input.nextLine();
        System.out.println(vowels(name));
    }
}