package HomeWork;

import java.util.Locale;
import java.util.Scanner;

public class ValidPasswordH2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please create a new and valid password.");
        String password = scanner.nextLine();


        boolean hasUpper = false;
        boolean hasLower = false;


        for(int i = 0; i<password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                hasUpper = true;
            }else if(Character.isLowerCase(password.charAt(i))){
                hasLower = true;
            }
        }
        boolean validPassword = (hasUpper && hasLower);
        System.out.println(validPassword);


    }















        /*
         String validPassword = "";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'A' && ch <= 'Z' && ch >= 'a' && ch <= 'z') {
                validPassword+=ch;
            }

            boolean valid = password.contains(validPassword);
            System.out.println(valid);

         */














        /*
        for(int i = 0; i<password.length(); i++){
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch) && Character.isUpperCase(ch)){
                System.out.println("true");
            }else{
                System.out.println("false");




                int lowercaseCounter = 0;
                int uppercaseCounter = 0;

                if (Character.isUpperCase(c)){
                uppercaseCounter++;
            }else if(Character.isLowerCase(c)){
                lowercaseCounter++;
            }
            if (password.length() == uppercaseCounter + lowercaseCounter) {
                System.out.println("Valid password");
            }else {
                System.out.println("Not valid password");


                if(hasUpper && hasLower){
      System.out.println("true");
    }else{
      System.out.println("false");

         */


    }



















