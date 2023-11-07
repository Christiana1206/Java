package loops;
import java.util.Scanner;
public class WhilePractice3 {
    public static void main(String[] args) {
        /*
        get age of user
        >>> print out his/her age for the next 5 years<<<

        "you are now ... years old"

        "your age will be ... in 5 years"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        int limit = age+5;

        int year = 2023;

        while(age<limit){
            age++;
            year++;
          System.out.println("You are " + age + " years old in the year " + year); // or ++year without year++

        }
          System.out.println("your age will be " + age+ " in 5 years");


    }
}
