package loops;
import java.util.Scanner;
public class WhilePractice5 {
    public static void main(String[] args) {

        /*
        get an integer number from user
        for that number, create a times table

        ex: number -> 4

        4*1=4
        4*2=8
        4*3=12
        ....
        4*10=40
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");

        int num = scanner.nextInt();

        int multiplizer = 1;

        while(multiplizer<=10) {
            System.out.println(num+" * "+ multiplizer+ " = "+num*multiplizer);
            multiplizer++;
        }














        /*
        while(multiplizer<=10) {
            System.out.println(num+" * " + multiplizer+ " = "+num*multiplizer);
            multiplizer++;
        }

         */
    }
}
