package ifStatements;
import java.util.Scanner;
public class NestedIfPractice1 {
    public static void main(String[] args) {

        /*
Ask user for their city name
If Chicago tell user >>>"You are living in one of the best city on earth"
If user lives in Chicago then Ask user for their school name
If school is codefish tell user >>>"You are lucky-you have Sara now"
*/

/*
If school is not codefish
Tell them to visit us
If city name is not chicago
Tell user to come to chicago and ask for codefish
 */

/*
If your school is codefish
Ask user which batch they are in
If they are in batch 18
Tell user "We are friend now"
If they are not in batch18
Tell User "how is the market?"
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("what city do you live in? ");
        String cityName = scanner.nextLine();

        if(cityName.equalsIgnoreCase("chicago")) {
            System.out.println("You are living in one of the best city on earth");
            System.out.println("What is your school's name ? ");
            String schoolName = scanner.nextLine();
            if(schoolName.equalsIgnoreCase("codefish")) {
                System.out.println("You are lucky-you have Sara now");
                System.out.println("Which batch are you in ? ");
                int batchNum = scanner.nextInt();
                if (batchNum == 18) {
                    System.out.println("We are friend now");
                }
                else {
                    System.out.println("how is the market?");

                }
            }
            else {
                System.out.println("let'a visit us");
            }
        }
        else {
            System.out.println("come to chicago and ask for codefish");
        }
    }
}
