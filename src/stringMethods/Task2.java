package stringMethods;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        /*
Ask user to enter a String value which should have space at the beginning or end
- Replace all letter 'a's with single '*' and letter 'e's with double '**',
- change all string value to UPPERCASE
- Find index of First '*'
- Multiply that value by 10 and
- Print out the result
*/
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string with space at the begining and end of it ");

        String word = input.nextLine();

       word =  word.replace('a', '*');

       word = word.replace("e", "**");

       word = word.toUpperCase();



        int indexOfStar = word.indexOf('*');

       indexOfStar*=10;

        System.out.println("result >> " + indexOfStar);

        System.out.println(word);

        System.out.println(word.trim());



        // solve the above problem using method chaining

        /*
Ask user to enter a String value which should have space at the beginning or end
- Replace all letter 'a's with single '*' and letter 'e's with double '**',
- change all string value to UPPERCASE
- Find index of First '*'
- Multiply that value by 10 and
- Print out the result
*/


 int value = word.replace('a', '*').replace("e", "**").toUpperCase().indexOf('*')*10;
      System.out.println(value);

       // System.out.println(word.toUpperCase().replace('A', '*').replace("E", "**").indexOf('*')*10);












    }
}
