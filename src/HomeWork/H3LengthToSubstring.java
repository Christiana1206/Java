package HomeWork;
import java.util.Scanner;
public class H3LengthToSubstring {

    /*
    Using scanner user is asked to enter one string value.
If this string length is odd number print middle 3 string from given value.
If the string length is even number print string without first letter.
 (You need to use if statement for this task)
Example 1:
Please enter the String value:
test
The output is:
est

Example 2:
Please enter the String value: Chicago // 7 //
The output is:
ica
     */

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.println("Please enter a string value.");
            String string = s.next();
            // Please don't change anything on lines above.

                if(string.length()%2 != 0){
                    System.out.println(string.substring(string.length()/2 -1, string.length()/2 + 2));
                }else{
                    System.out.println(string.substring(1));
                }
            }

        }

