package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        System.out.println("*****************BEFORE****************");

        FileInputStream file = new FileInputStream("TestInfo");

        System.out.println("+++++++++++++++++AFTER+++++++++++++++++");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
            Thread.sleep(500);
        }

        //throw

        String str = "Alex";

        if(!str.equalsIgnoreCase("alex")){
            throw new RuntimeException();
        }

        System.out.println("HHIII");



    }
}
