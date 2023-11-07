package loops;


import java.util.Scanner;

public class Task6ReverseAString {
    public static void main(String[] args) {
        //write java code to reverse the given string value
        // + check if the given string is palindrome !!!


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your word");
        String str = scanner.nextLine();

        String reversed = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversed+=str.charAt(i);

           // System.out.println(reversed); // --> piramidka

        }
        System.out.println(reversed);



















        //String str = "chocolate"; // --> etalocohc

        /*
        My version:
        for (int i = str.length() - 1; i < str.length(); i--) {
        System.out.print(str.charAt(i));
        }
         */
        /*

        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
         */
        // Progressive version:

/*
        String reversed = "";
        char ch;
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            reversed = ch+reversed;
        }
        System.out.println(reversed);

*/
        //without user

/*
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reversed+=str.charAt(i);

        }
        System.out.println(reversed);

        //check if the given string is palindrome
*/
        if(str.equals(reversed)) {
            System.out.println("It is a palindrome");
        }else{
            System.out.println("is not a palindrome");
        }








        /*
        String str = "chocolate";

        String repeated = "";
        for(int i =0; i<str.length(); i++){
            repeated+=str.charAt(i);

        }
        System.out.println(repeated);
*/





    }
}
