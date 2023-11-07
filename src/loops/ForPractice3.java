package loops;
import java.util.Scanner;
public class ForPractice3 {
    public static void main(String[] args) {
        /*
        get a string from user
        print out letters from that string by using for loop
        letter should be separated by a comma
        ex: String str = "remote"
        --> r, e, m, o, t, e

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your message");

        String str = scanner.nextLine();

        for (int index = 0; index < str.length(); index++) {
            if (index != str.length() - 1) {
                System.out.print(str.charAt(index) + ", ");
            } else {
                System.out.print(str.charAt(index));
            }
        }
    }
}
