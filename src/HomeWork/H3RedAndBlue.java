package HomeWork;
import java.util.Locale;
import java.util.Scanner;
public class H3RedAndBlue {

    /*
    Using scanner the user is asked the to enter any String value.
If this String has letters of red or blue with lower case print the red or
blue. Other wise do not print anything.
EXAMPLE-1:
Input: "xxredyy"
Output: red
EXAMPLE-2:
Input: "xbxltue"
Output: blue
EXAMPLE-3
Input : "rllltteaaadkkk"
Output: red
EXAMPLE-4:
Input: "rllleell" -> Since the string doesn't have letters of red or blue we shouldn't print anything.
Output:
     */


    public static void main(String[] args) {
        System.out.println("Enter a string value");
        String str = new Scanner(System.in).next();

        str = str.toLowerCase();

        if(str.contains("r") && str.contains("e") && str.contains("d")){
            System.out.println("red");
        } else if(str.contains("b") && str.contains("l") && str.contains("u") && str.contains("e")) {
            System.out.println("blue");

        }else{
            System.out.println();
        }


    }
}
