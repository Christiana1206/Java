package loops;

public class DoWhilePractice1 {
    public static void main(String[] args) {

        System.out.println("======do while example w/ condition is true====");

        int num1 = 6, num2 = 5;

        do{
            System.out.println("BYE");
            num2++; // now 6
             // or num1--  --> 5
        } while (num1>num2); //true condition

        System.out.println("=====do while example w/condition is false =====");

        num1 = 6; num2 = 2;

        do{
            System.out.println("HI");
        } while (num1<num2);
        System.out.println("======while loop=====");
        num1 = 6; num2 = 2;

        while (num1<num2){
            System.out.println("+++++SAYY HIIII+++++");
            num1--; // it's false, because of this it's printed nothing versus in case with do while
        }


        char ch = 'm';  // see ASCII table
        do {
            System.out.println("we almost going home");
            ch--;
        } while (ch>'b');







    }


}
