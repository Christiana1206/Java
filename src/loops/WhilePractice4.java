package loops;
import java.util.Scanner;
public class WhilePractice4 {
    public static void main(String[] args) {

        //infinite loop - loop that does not stop / goes forever

        // int number = 1;
        //  while (number==1) {
        //     System.out.println("Hi");
        //    }

        /*
        Get on integer number from user and find the divisors of that given number, shows those divisors

        which number can I divide 10 by and get on even/numbers without ont remainder

        10 >> 1,2,5,10
        15 >> 1,3,5,15
        13 >> 1,13 - prime number(if the number is divisible only by 1 and itself)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");

        int num = scanner.nextInt();

        int divisor = 1;

        while (divisor <= num) {

            if(num%divisor == 0){
                System.out.println(divisor);
            }
            divisor++;

        }










        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");

        int num = scanner.nextInt();

        int divisorNum = 1;

        while (divisorNum <= num) {

            if (num%divisorNum == 0) {
                System.out.println(divisorNum);
            }
            divisorNum++;


        }

         */
    }
}
