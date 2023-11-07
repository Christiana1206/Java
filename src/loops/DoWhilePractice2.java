package loops;
import java.util.Scanner;
public class DoWhilePractice2 {
    public static void main(String[] args) {
         /*
         do while loop

         ask user to provide 2 integer numbers and find the sum of numbers in the given range
         and then print the sum

         ex: n1 = 5, n2 = 8;
         5+6+7+8=26;
         "the total is 26"
          */
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter  integer numbers");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = 0;
        do{
            System.out.println(num1);
            sum+=num1;
            //System.out.println("the sum of all numbers of the range is " +sum); - shows us every step on the way
            num1++;
        } while(num1<=num2);
        System.out.println("the sum of all numbers of the range is " +sum);

            }




        }





