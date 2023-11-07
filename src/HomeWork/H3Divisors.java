package HomeWork;

import java.util.Scanner;

public class H3Divisors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a starting number");
        int startingNumber = scanner.nextInt();
        System.out.println("Enter an ending number");
        int endingNumber = scanner.nextInt();


       /* Using a scanner the user is asked to provide starting and ending numbers.
                Print how many numbers are divisible by 3 and 5 between starting number and ending number.

        */

        int count = 0;

        for (int num = startingNumber; num <= endingNumber; num++) {

            if (num % 3 == 0 && num % 5 == 0) {
                count++;

            }

        }
        System.out.println(count);
    }
}
