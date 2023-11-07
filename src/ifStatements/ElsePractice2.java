package ifStatements;
import java.util.Scanner;
public class ElsePractice2 {
    public static void main(String[] args) {
        /*
ask user that if s/he has driver license
-when the answer is "yes, I do have.." >>> print >> "you are great!"
-otherwise print >> "DMV is next door, please visit";
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a driver license? (yes/no)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes") || answer.contains("yes")) {
            System.out.println("you are great!");
        } else {
            System.out.println("DMV is next door, please visit");
        }
    }
}



