package ifStatements;

import java.util.Scanner;

public class P3E {
    public static void main(String[] args ) {

    /*
ask user to enter  first letter of the day
if the letter is: M print "your day is Monday"
if the letter is: T print "your day is Tuesday or Thursday"
if the letter is: W print "your day is Wednesday"
if the letter is: F print "your day is Friday"
if the letter is: S print "your day is Saturday or Sunday"
 */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first letter of the week day");

        String str = "" + input.nextLine().charAt(0);

        // char ch = input.nextLine().charAt(0);

        if (str.equalsIgnoreCase("m")) {
            System.out.println("you day is Monday");
        }
        if (str.equalsIgnoreCase("t")) {
            System.out.println("you day is Tuesday");
        }
        if (str.equalsIgnoreCase("w")) {
            System.out.println("you day is Wednesday");
        }
        if (str.equalsIgnoreCase("f")) {
            System.out.println("you day is Friday");
        }
        if (str.equalsIgnoreCase("s")) {
            System.out.println("you day is Saturday");
        }

        // when user enter none of the expected values >> "Not a valid entry"

        if(!(str.equalsIgnoreCase("m") || str.equalsIgnoreCase("t") ||
                str.equalsIgnoreCase("w") || str.equalsIgnoreCase("f")
                        || str.equalsIgnoreCase("s"))) {
            System.out.println("Not a valid entry");
        }

    }
}
