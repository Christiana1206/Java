package variables;
import java.util.Scanner;
public class TimQA {
    public static void main(String[] args) {

        /*
        ask user input first and last name
        ask user age --> check age 21+
        if age less than 21 --> error
        if user has $10+ --> beer
        if user has $20+ --> beer, vodka
        if user has $30+ --> all
        we have alcogol:
        1. beer --> $10
        2. vodka --> $20
        3. liquer--> $30
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first and last name");
        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("How much money you have");
            int money = scanner.nextInt();
            if (money>=10 && money<=20) {
                System.out.println("you can buy a beer only");
            } else if (money >= 20 && money<=30) {
                System.out.println("You can buy beer and vodka");
            } else if (money >= 30) {
                System.out.println("You can buy beer, vodka and luqier ");
            }

        } else {
            System.out.println("Your age is not legal");
        }


    }}

