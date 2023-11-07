package ifStatements;
import java.util.Scanner;
public class ElsePractice3 {
    public static void main(String[] args) {
        /*
ask user for their house number
if the number is even number >> "your house should be on the right side of street"
                   otherwise >> "your house should be on the left side of the street"
 even - 2,4,6,8....
 odd - 1,3,5,7,9....
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your house number?");

        int houseNum = scanner.nextInt();

        if (houseNum%2 == 0) {
            System.out.println("your house should be on the right side of street");
        } else {
            System.out.println("your house should be on the left side of the street");
        }
    }
}
