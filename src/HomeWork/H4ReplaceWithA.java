package HomeWork;

import java.util.Scanner;

public class H4ReplaceWithA {
    public static void main(String[] args) {

        System.out.println("Enter a string value");
        Scanner s = new Scanner(System.in);

        String str = s.next();
        // Success
        String a = "a";
        // str is my string.
        // To remove the first letter
        // str.substring(1);
        // to remove the second one
        // str = str.substring(0)


        for (int i = 0; i < str.length(); i++) {
            String letter = "";


            for(int j = 0; j<=i; j++){
                letter = letter.concat(a); //letter+=a;

            }
            letter = letter.concat(str.substring(i+1)); //letter +=str.substring(i+1);
            System.out.println(letter);


        }

        }

    }






