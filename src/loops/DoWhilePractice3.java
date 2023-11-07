package loops;

public class DoWhilePractice3 {
    public static void main(String[] args) {

        /*
        print out the numbers from 20 0
        - counting down-
        */

        int num = 20;

        do {
            System.out.print(num + ", ");
            num--;
        } while(num>=0);


        // with while loop

        int num1 = 20;

        while (num1>=0) {
            System.out.println(num1);
            num1--;  // only even numbers: num1-=2
        }
        // only odd numbers:

        int number = 20;

        while(number>=0) {
            if(number%2 != 0) {
                System.out.println(number);
            } number--;
        }

        System.out.println("==================================");

        // print only numbers between 20 and 0 which are multiply of 3 (18, 15, 12, 9, 6, 3)

       int numb = 20;

        while(numb>0) {
            if(numb%3 == 0) {
                System.out.println(numb);
            }numb--;
        }





    }
}
