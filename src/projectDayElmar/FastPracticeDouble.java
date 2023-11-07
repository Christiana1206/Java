package projectDayElmar;

import java.util.Scanner;

public class FastPracticeDouble {
    public static void main(String[] args) {


        // input: "cat hates dogs"
        // output: "Cat Hates Dogs"

        // Use re-assign, by removing first word (middle level)
        //Or if you want, you can do it on one line (hard level)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();
        // 1 - Get first word from text, make first letter capital
        String firstWord = text.substring(0, text.indexOf(' '));
        String firstCapitalOne = firstWord.substring(0, 1);
        firstCapitalOne = firstCapitalOne.toUpperCase();
        String finalFirstWord = firstCapitalOne + firstWord.substring(1);
        System.out.println(finalFirstWord);

        text = text.substring(text.indexOf(' ')+1);

        String secondWord = text.substring(0, text.indexOf(' '));
        String secondCapitalOne = secondWord.substring(0, 1);
        secondCapitalOne = secondCapitalOne.toUpperCase();
        String finalSecondWord = secondCapitalOne + secondWord.substring(1);
        System.out.println(finalSecondWord);

        text = text.substring(text.indexOf(' ')+1);

        String thirdWord = text;
        String thirdCapitalOne = thirdWord.substring(0, 1);
        thirdCapitalOne = thirdCapitalOne.toUpperCase();
        String finalThirdWord = thirdCapitalOne + thirdWord.substring(1);

        System.out.println(finalFirstWord + " " + finalSecondWord + " " + finalThirdWord);


    }
}