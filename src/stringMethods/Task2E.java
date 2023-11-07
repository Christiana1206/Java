package stringMethods;
import java.util.Scanner;
public class Task2E {
    public static void main(String[] args) {

        /*
Ask user to enter a String value which should have space at the beginning or end
- Replace all letter 'a's with single '*' and letter 'e's with double '**',
- change all string value to UPPERCASE
- Find index of First '*'
- Multiply that value by 10 and
- Print out the result
*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your message with the space at the beginning or end");

        String str = scanner.nextLine();

        str = str.replace('a', '*');

        System.out.println(str);

        str = str.replace("e", "**");
        System.out.println(str);

        System.out.println( str.toUpperCase());

        int xInd = str.indexOf("x");

        System.out.println(xInd);

        xInd*=10;

        System.out.println(xInd);

        str = str.replace(" ", "**.**");

        System.out.println(str);

        int indOfT1 = str.indexOf("t");

        System.out.println(indOfT1);

        int indOfT2 = str.indexOf('t', str.indexOf('t')+1);


        System.out.println("result >>" + indOfT2);

        System.out.println(str.length());

        System.out.println(str.charAt(8));

        System.out.println(str.concat("@"));






    }
}
