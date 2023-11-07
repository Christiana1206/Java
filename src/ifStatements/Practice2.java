package ifStatements;
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {

        /*
Use Scanner to get an integer number between 1 and 5 from user
if the number is 1 --> "Monday"
if the number is 2 --> "Tuesday"
...
if the number is 5 --> "Friday"
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number between 1 and 5");
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("Monday");
        }
        if (num == 2) {
            System.out.println("Tuesday");
        }
        if (num == 3) {
            System.out.println("Wednesday");
        }
        if (num == 4) {
            System.out.println("Thursday");
}
        if (num == 5) {
            System.out.println("Friday");
}


        //Task: when user number more tha 5 or less than 1, print "your entry is out of range"

        if (num > 5 || num < 1) {
            System.out.println("your entry is out of range");
        }























    }


}
