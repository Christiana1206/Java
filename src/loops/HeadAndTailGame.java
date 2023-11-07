package loops;

import java.util.Random;
import java.util.Scanner;

public class HeadAndTailGame {
    public static void main(String[] args) {
        /*
        Task 1
I want to create a head/tail game (flipping coin) with java codes;
-At the beginning print "Game is started, MAKE a GUESS! HEAD/TAIL " So, let user know that the game started.
- get user's guess as HEAD/TAIL
- compare user's guess with your random number 0/1 --> random.nextInt(2) <--
    - if guess is correct, print       ---> "You are lucky, it is your day today."
    - if the guess isn't correct, print  -> "Sorry, that was not the correct choice!"
- at the end, ask user "Do you want to play again? Y/N "
    - if the answer is Y --> keep playing (this is your while condition!!!)
    - if the answer is N --> print --> "Its Ok, SEE you NEXT time!"
         */

        //ternary
        /*
        System.out.println("white".equalsIgnoreCase("black") ? "yes" : "no"); //i want to store it
        String str = "white".equalsIgnoreCase("black") ? "yes" : "no";

        System.out.println(5==5 ? 10 : "Bye"); // returns us 10
        */

        //Random class
        /*
        Random random = new Random();
        int a = random.nextInt(10); // it will give any number from 0 to 9
        System.out.println(a);

        // Parameter is any data that you pass to the function to use. In main method the parameter is (String[] args)


         */


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;
        do {
            System.out.println("Game is started, MAKE a GUESS! Guess HEAD/TAIL");
            String guess = scanner.nextLine();

            int flip = random.nextInt(2);
            String result = flip == 0 ? "HEAD" : "TAIL";

            if (guess.equalsIgnoreCase(result)) {
                System.out.println("You are lucky, it is your day.");
            } else {
                System.out.println("Sorry, that was not the correct choice!");
            }
            System.out.println("Do you want to play again? Yes/No ");
            playAgain = scanner.nextLine();

        } while (playAgain.equalsIgnoreCase("yes"));
        System.out.println("It's ok, see you next time");

        /*
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;
        do{
            System.out.println("Game is started, MAKE a GUESS! HEAD/TAIL");
            String guess = scanner.nextLine();
            int flip = random.nextInt(2);//0 or 1
            String result = flip == 0 ? "HEAD" : "TAIL";
            if(guess.equalsIgnoreCase(result)){
                System.out.println("You are lucky, it is your day today.");
            }else {
                System.out.println("Sorry, that was not the correct choice!");
            }
            System.out.println("Do you want to play again? Yes/No ");
            playAgain = scanner.nextLine();
        }while (playAgain.equalsIgnoreCase("yes"));
        System.out.println("Its Ok, SEE you NEXT time!");
*/






    }
}















