package stringMethods;

public class Practice2 {
    public static void main(String[] args) {

        String day = "Tuesday";

        day+=123;
        day+=true;
        day+=5.6;

        System.out.println(day); // Tuesday123true5.6
        // here we use compound signing operator +=, this means re-assignment

        // concat()

        day.concat(" is your day ");

        System.out.println(day); // because we haven't reassign it

        day = day.concat(" is your day "); // now we reassign this day
        System.out.println(day); // Tuesday123true5.6 is your day

        day.concat("true");
        System.out.println(day); // the same: Tuesday123true5.6 is your day

        day = day.concat("true");
        System.out.println(day); // Tuesday123true5.6 is your day true


        System.out.println("==============charAt()===================");


        // charAt(); -- > take the index number as a parameter and gives/returns you a char

        day = "Tuesday";
        char letter = day.charAt(3); // s
        System.out.println(letter); // s, counts even the spaces

        System.out.println(day.charAt(5)); // a


        // lenth(); -- > will return number of characters of the string

        int count = day.length(); //  7
        System.out.println(count); // 7

        day = day.concat("*** ! ***");
        System.out.println(day); // day = Tuesday*** ! ***
        int count2 = day.length();
        System.out.println(count2); // 16


        // I want to print out the charAt the last position of the String


        System.out.println(day.charAt(15)); // *
       // System.out.println(day.charAt(16)); // - exception --> runtime error, how do we know? - because when we type it, java was not complaining
        // for example, when we miss semicolon, the program reacts immediately - is compiletime error

        int number = 8;

        char letter2 = day.charAt(number);
        System.out.println("This is the charAt index 8 >> " + letter2); // *

       // show the last char of string using the length() method, not using the index method directly

        int lastPosition = day.length()-1;
        System.out.println(lastPosition);


        String str = "Computer";

        int a = str.length()-1;

        System.out.println(a);
    }

}
