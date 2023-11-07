package ifStatements;
import java.util.Scanner;
public class ElseIfPractice2 {
    public static void main(String[] args) {

        /*
get a number from user
when the number is greater than 0 tell user --> "your number is a positive number"
when the number is less than 0 tell user  --> "your number is a negative number"
when neither tell user --> your number must be ZERO
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some number");

        int num = scanner.nextInt();

        if(num>0) {
            System.out.println("your number is a positive number");
        } else if(num<0) {
            System.out.println("your number is a negative number");
        } else {
            System.out.println("your number must be ZERO");
        }

    }
}
