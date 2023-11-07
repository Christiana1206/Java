package stringMethods;
import java.util.Scanner;
public class Task3E {
    public static void main(String[] args) {
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

         System.out.println("Please enter any String : ");

        String str = scanner.nextLine();

        System.out.println(str.charAt(0));

       // char lastCh = str.charAt(str.length() - 1);

        System.out.println(str.charAt(str.length() -1));

        System.out.println(str.indexOf('c'));

        System.out.println(str.indexOf('c', str.indexOf('c')+1));

        System.out.println(str.length());

        System.out.println(str.indexOf('x'));

        System.out.println(str.charAt(str.length()/2));


        System.out.println(str.indexOf('c'));


        System.out.println(str.length());

        int indexOfx = str.indexOf('x');
        System.out.println(indexOfx);
        char middleCh = str.charAt(str.length()/2);
        System.out.println(middleCh);








    }
}
