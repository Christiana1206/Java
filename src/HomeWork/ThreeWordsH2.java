package HomeWork;
import java.util.Scanner;
public class ThreeWordsH2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string with three words.");
        String threeWords = new Scanner(System.in).nextLine();

       String firstWord = threeWords.substring(0, threeWords.indexOf(' '));
       System.out.println(firstWord);

        threeWords = threeWords.substring(threeWords.indexOf(' ')+1);

        String secondWord = threeWords.substring(0, threeWords.indexOf(' '));
        System.out.println(secondWord);

        String thirdWord = threeWords.substring(threeWords.indexOf(' ')+1);
        System.out.println(thirdWord);

        String firstCapipalOne = firstWord.substring(0, 1);
        firstCapipalOne = firstCapipalOne.toUpperCase();


        String secondCapipalOne = secondWord.substring(0, 1);
        secondCapipalOne = secondCapipalOne.toUpperCase();

        String thirdCapipalOne = thirdWord.substring(0, 1);
        thirdCapipalOne= thirdCapipalOne.toUpperCase();

        System.out.println(firstCapipalOne+secondCapipalOne+thirdCapipalOne);

        String lastLetterFirst = firstWord.substring(firstWord.length()-1);

        String lastLetterSecond = secondWord.substring(secondWord.length()-1);

        String lastLetterThird = thirdWord.substring(thirdWord.length()-1);

        System.out.println(lastLetterFirst+lastLetterSecond+lastLetterThird);

        if (firstWord.length() == secondWord.length() && secondWord.length() == thirdWord.length() &&
                firstWord.length() == thirdWord.length()) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }



    }
}
