package scannerPractice;

import java.util.Scanner;

public class Practice4 {

        public static void main(String[] args) {
        /*
David wants to deposit money into his bank account.
- he already got $200 in his account
– he got three different paychecks ($480, $600 and $350)
– he can only deposit one paycheck at a time
– after he got his money in the account,
he bought a phone for $599 and headphones for $299
-calculate his final money in his account.
==> tell him how much is left in his account <==
*/

            Scanner scanner = new Scanner(System.in);
            double balance = 200;
            System.out.println("Please enter your first paycheck amount");

            double firstPayCheck = scanner.nextDouble();

            System.out.println("Please enter your second paycheck amount");

            double secondPayCheck = scanner.nextDouble();

            System.out.println("Please enter your third paycheck amount");

            double thirdPayCheck = scanner.nextDouble();

            balance += firstPayCheck+secondPayCheck+thirdPayCheck;

            System.out.println("How much was the phone that you bought?");

            double phonePrice = scanner.nextDouble();

            System.out.println("How much was the headphone that you bought?");

            double headphonePrice = scanner.nextDouble();

            balance-=phonePrice+headphonePrice;

            System.out.println("Hey David, your final balance is: $"+balance);







        }

}
