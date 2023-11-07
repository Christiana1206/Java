package loops;

public class WhilePractice2 {
    public static void main(String[] args) {
        /*
        create a while loop to print out numbers between 10 and 15(including the 10 and 15 as well)
         */
        int num1 = 10, num2 = 15;
        while (num1 <= num2) {
            System.out.println(num1);
            num1++;

            /* the same
            int num1 = 10, num2 = 15;
        while (num1<=num2){
            System.out.println(num1++);
            //num++;

            int num1 = 10, num2 = 15;
        while (num1<=num2){
            System.out.println(++num1); --> 11 12 13 14 15 16 , starts from 11 to 16

             */
        }

        System.out.println("============================================");

        /*
        TASK:
        print out even numbers between 20 and 40(not including 20 and 40)
         */

        int firstN = 20, lastN = 40;
        while (firstN < lastN- 2) {
            System.out.println(firstN += 2);

        } // OR
        System.out.println("+++++++++++++++++++++++++++++++");

        int firstNum = 21, lastNum = 39;

        while (firstNum <= lastNum) {
            if (firstNum%2 == 0) {
                System.out.println(firstNum);
            }
                firstNum++;


        } // OR
        System.out.println("================================");

        firstNum = 20; lastNum = 38;
        while (firstNum<lastNum) {
            firstNum+=2;
            System.out.println(firstNum);

        }

    }
}
