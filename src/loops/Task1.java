package loops;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        /*
        get an integer number from user
        for that integer number create a star tree
        ex: number = 4
        *
        **
        ***
        ****
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");

        int number = scanner.nextInt();

        String star = "*";

        do {
            System.out.println(star); //*
            star+="*";       // OR: star = star.concat("*");
            number--;
        } while (number>0);



    }
}
