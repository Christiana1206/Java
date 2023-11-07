package projectDayElmar;
import java.util.Scanner;
public class FastPractice {
    public static void main(String[] args) {
        // 1 - Receiving data
        // 2 - Get Second Word
        // 3 - Make capital letter
/*
        Scanner inputData = new Scanner(System.in);
        String text = inputData.nextLine();
        // Natural black
        String firstWord = text.substring(0, text.indexOf(' ')); // Natural
        String secondWord = text.substring(text.indexOf(" ")+1); // black
        String bLetter = secondWord.substring(0,1); // b
        String bCapital = bLetter.toUpperCase(); // B
        System.out.println(firstWord + " " + bCapital + secondWord.substring(1));
 */







        // String text = "microphone";
       // System.out.println(text.substring(0 ,5));



        // input: "cat hates dogs"
        // output: "Cat Hates Dogs"

        // Use re-assign, by removing first word (middle level)
        //Or if you want, you can do it on one line (hard level)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();
        // 1 - Get first word from text, make first letter capital
        String firstWord = text.substring(0, text.indexOf(' ')); // cat
        String firstCapitalOne = firstWord.substring(0, 1); // c
        firstCapitalOne = firstCapitalOne.toUpperCase(); // C
        String finalFirstWord = firstCapitalOne + firstWord.substring(1 ); // Cat
        System.out.println(finalFirstWord);
        // 2- Re-assign text by removing first word

        text = text.substring(text.indexOf(' ')+1); // "hates dogs"
        // 3 - Get first word from text after re-assigning (second word comes first)
        //System.out.println("1st word: " + finalFirstWord);

        String secondWord = text.substring(0, text.indexOf(' '));// hates
        String secondCapitalOne = secondWord.substring(0, 1); //h
        secondCapitalOne = secondCapitalOne.toUpperCase(); // H
        String finalSecondWord = secondCapitalOne + secondWord.substring(1);

        text = text.substring(text.indexOf(' ')+1); // "dogs"
        System.out.println("Re-assigned: " + text);
        // 5 - & 6- Continue this logic

        String thirdWord = text; // dogs
        String thirdCapitalOne = thirdWord.substring(0, 1); // d
        thirdCapitalOne = thirdCapitalOne.toUpperCase(); // D
        String finalThirdWord = thirdCapitalOne + thirdWord.substring(1);

        System.out.println(finalThirdWord);

        System.out.println(finalFirstWord + " " + finalSecondWord + " " + finalThirdWord + " ");







    }
}
