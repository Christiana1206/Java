package HomeWork;
import java.util.Scanner;
public class RandomWordandLetterH2 {
    public static void main(String[] args) {
        Scanner user =new Scanner(System.in);
        System.out.println("Enter a random word");
        String randomWord = user.nextLine().toLowerCase(); // -> User enters a random word.
        System.out.println("Enter number of letter that word consists of");
        int numberOfLetters = user.nextInt();  // -> User tries to enter number of letters that word consists of.

        boolean checkingGuessCounting = numberOfLetters == randomWord.length();
        System.out.println(checkingGuessCounting);


        System.out.println("Enter a letter that you want to learn its index");
        String enteredLetter = user.next().toLowerCase(); // -> User enters a letter to learn its index.




        if(randomWord.contains(enteredLetter)){
            System.out.println(randomWord.indexOf(enteredLetter));
        } else {
            System.out.println("This letter is absent in the given word");
        }





        //for(int i=0; i<randomWord.length(); i++){
           // System.out.println(randomWord.charAt(i));
        }

      /* if (enteredLetter.equals(randomWord.charAt(0))) {
            System.out.println(numLetter1);
        } else if (enteredLetter.equals(randomWord.charAt(1))) {
            System.out.println(numLetter2);
        } else if (enteredLetter.equals(randomWord.charAt(2))) {
            System.out.println(numLetter3);
        } else if (enteredLetter.equals(randomWord.charAt(3))) {
            System.out.println(numLetter4);
        } else if (enteredLetter.equals(randomWord.charAt(4))) {
            System.out.println(numLetter5);
        } else {
                System.out.println("out of range");
        }
*/


        }



