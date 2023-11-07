package switchStatement;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        /*
you have strawberry, apple, orange, grape, mango, watermelon
ask user for their favorite fruit
if their favorite is in the store --> "We have you favorite fruit (fruitname) at the store"
otherwise --> "We are sorry, we do not have your favorite fruit (fruitName) in the store"
 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favorite fruit? ");

        String fruit = scanner.nextLine();

        switch (fruit.toLowerCase()) {

            case "strawberry":
                System.out.println("We have you favorite fruit " + fruit +  " at the store ");
                break;
            case "apple":
                System.out.println("We have you favorite fruit " + fruit + " at the store");
                break;
            case "orange":
                System.out.println("We have you favorite fruit " + fruit + " at the store");
                break;
            case "mango":
                System.out.println("We have you favorite fruit " + fruit + " at the store");
                break;
            case "watermelon":
                System.out.println("We have you favorite fruit " + fruit + " at the store");
                break;

            default:
                System.out.println("We are sorry, we do not have your favorite fruit " + fruit + " in the store");


        }


    }
}
