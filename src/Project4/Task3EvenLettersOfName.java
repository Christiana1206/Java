package Project4;

import java.util.Scanner;

public class Task3EvenLettersOfName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = scanner.nextLine();

           // for (int i = 0; i < name.length(); i+=2){
            //System.out.println(name.charAt(i)); //kristina // k i t n

        for (int i = 0; i < name.length(); i++){
            if(i%2 == 0) {
                System.out.println(name.charAt(i));
            }


        }


    }
}
