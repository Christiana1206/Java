package HomeWork;


import java.util.Scanner;

public class ConcatStrLength {
    public static void main(String[] args) {
        /*
        User will enter two string values using scanner.
If both string length is same, concatenate them together. Then, print the result.
If both string length is not same, omit the last chars from the longer string so it will be the same
length as the shorter string. After making both strings the same length,
concatenate them and print the result.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();

        if (str1.length() == str2.length()) {
            System.out.println(str1.concat(str2));
        } else if (str1.length() < str2.length()) {
            System.out.println(str1 + (str2.substring(0, str1.length())));
        } else if (str1.length() > str2.length()) {
            System.out.println((str1.substring(0, str2.length()) + str2));


            //OR

            boolean condition = str1.length() <= str2.length();
            // This condition will be true if the str1 is shorter than str2.
            //  This condition will be false if the str2 is shorter than str1.
            if (condition){
                System.out.println(str1 + str2.substring(0,str1.length()));
            }else {
                System.out.println(str1.substring(0,str2.length()) + str2);
            }



        }

    }
}


