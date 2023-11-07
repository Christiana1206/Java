package arraysPractice;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        /*
        print out every name of the fruit in reverse version
        elppa
        ognam
        iwik
        ....
         */
        String[] fruits = {"apple", "mango", "kiwi", "grape", "grapefruit", "plum", "pear", "pineapple", "banana", "orange", "peach", "apricot", "guava", "lemon"};


        for (int i = 0; i < fruits.length; i++) {
            String reversed = "";


            for (int f = fruits[i].length()-1; f >= 0; f-- ){

                reversed+=fruits[i].charAt(f);

            }
            System.out.println(reversed);

        }


        /*
       for(int i = 0; i < fruits.length; i++){
           String reversed = "";
           for(int f = fruits[i].length()-1; f >=0; f--){
               reversed+=fruits[i].charAt(f);
           }
           System.out.println(reversed+" the reversed version of "+fruits[i]);

        }


         */























/*
        for(int i = 0; i < fruits.length; i++) {
            String reversed = "";
            for (int f = fruits[i].length() - 1; f >= 0; f--) {
                reversed += fruits[i].charAt(f);
            }
            System.out.println(reversed+ " is the reversed version of " + fruits[i]);
        }
       // System.out.println("There are "+fruits.length+" fruits");


 */

    }
}
