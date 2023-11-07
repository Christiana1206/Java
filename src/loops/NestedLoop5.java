package loops;

public class NestedLoop5 {
    public static void main(String[] args) {
        /*
        create a multiplication table for numbers 1 to 12
        1*1 = 1
        ......
        1*10 = 10
        ________
        12*1 = 12
        ......
        12*10 = 120
         */

        for (int num = 1; num <= 12; num++) {
           // break; //--> nothing is reacheable any more

            for (int mult = 1; mult <= 10; mult++) {
               // if (mult > 8) {
                  //  break; --> it will do the times table for all 12 numbers, but only until the multiple of 8
                    System.out.println(num + " * " + mult + " = " + num * mult);
                   //  break; // --> stops the nearest loop, it prints the above line once then exist the child loop
                }
               System.out.println("***********************");
              // break; // it goes to full inner loop once (times table only for 1) --> num++ will never used

            }


        }
    }
