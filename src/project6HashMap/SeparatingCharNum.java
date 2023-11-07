package project6HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SeparatingCharNum {
    public static void main(String[] args) {

        //Fix the string by separating chars and numbers and print them


        String str = "jh479n*#d54l98m$";

        String letters = "";
        String numbers = "";
        String symbols = "";


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                letters+=str.charAt(i);
            }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                numbers+=str.charAt(i);
            }else {
                symbols+=str.charAt(i);
            }
        }
        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(symbols);
    }
}

