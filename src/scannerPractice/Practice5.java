package scannerPractice;

import java.util.Scanner;

public class Practice5 {
        public static void main(String[] args) {

            // example on how to take a char by using Scanner

            //take the first initial of the user's first and last name.
            //ex. David White -> DW

            Scanner scanner = new Scanner(System.in);
            char firstnameInitial = scanner.nextLine().charAt(0);


        }
}
