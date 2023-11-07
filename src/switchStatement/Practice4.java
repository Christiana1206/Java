package switchStatement;
import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {
        /*
ask user to enter two numbers and name of an operator(add, subtract, multiply)
-apply matching operator and print the result
Example output: if the operation is: multiplication
                        result is: firstNumber * secondNumber

*/
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter two integer numbers to work with ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Enter the operation you choose: add, subtract, multiply, divide ?");
        String operator = scanner.next().toLowerCase();
        switch (operator) {
            case "add":
                System.out.println("The result is " + (num1 + num2));
                break;
            case "subtract":
                System.out.println("The result is " + (num1 > num2 ? (num1 - num2) : (num2 - num1)));
                break;
            case "multiply":
                System.out.println("The result is " + (num1 * num2));
                break;
            case "divide":
                System.out.println("The result is " + (num1 > num2 ? (num1 / num2) : (num2 / num1)));
                break;
            default:
                System.out.println("incorrect");
        }
        }
        }

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two integer numbers to work with");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("What math operation do you want to do with your numbers ex: add, subtract, multiply, divide?");
        String operator = scanner.next().toLowerCase();
        switch (operator) {
            case "add":
                System.out.println("The result is " + (num1 + num2));
                break;
            case "subtract":
                System.out.println("The result is " + (num1 > num2 ? (num1 - num2) : (num2 - num1)));
                break;
            case "multiply":
                System.out.println("The result is " + (num1 * num2));
                break;
            case "divide":
                System.out.println("The result is " + (num1 > num2 ? (num1 / num2) : (num2 / num1)));
                break;
            default:
                System.out.println("Not a valid Operator");
                break;
        }
    }
}
*/
