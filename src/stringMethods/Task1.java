package stringMethods;
import java.util.Scanner;
public class Task1 {
    public static void main(String [] args) {

        /*
 Task: Please create a new class called Task1 under stringMethods
 get a String from user via scanner and print out:
- first char
- last char
- indexOf second matching letter 'c'
- length of string
- index of x
- middle char
  */
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter any String value below");

        String str = scanner.nextLine();

        System.out.println(str.charAt(0));

        int lastIndex = str.length() - 1;
        System.out.println(str.charAt(lastIndex));

        str.indexOf('c'); // 0
        System.out.println(str.indexOf('c',str.indexOf('c') + 1));

       // System.out.println(str.indexOf('c',str.indexOf('c') + 1)+1);

       // System.out.println(str.indexOf('c',str.indexOf('c') + 1)+1);



        System.out.println(str.length());

        System.out.println(str.indexOf('x'));

        char middleChar = str.charAt(str.length()/2);
        System.out.println(middleChar);











    }
}
