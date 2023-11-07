package arraysPractice;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {

        Object[] items = {6, 7.8, "Alex", true, 'g'};
        System.out.println(Arrays.toString(items)); // [6, 7.8, Alex, true, 'g']

        // i want to print out just 'g'
        System.out.println(items[4]);

        // store the value 'g'
        Object letter1 = items[4]; // not char

        //cast
        char letter2 = (char) items[4];

        Object num1 = items[0];
        int num2 = (int) items[0];
        //System.out.println(num1*6); //Operator '*' cannot be applied to 'java.lang.Object', 'int'
        System.out.println(num2 * 6); // now we created the number like integer

        System.out.println("====================================");
/*
print out every element one by ine from Object array
 */

        /*
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
*/
            /* an console should show "Good afternoon" after each element
            store the resulting message in a String array

             */
                String[] strArray = new String[items.length];

            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i] + " Good afternoon ");

              //  strArray[i] = items[i] + " Good afternoon ";

                strArray[i] = items[i].toString().concat("good afternoon");
            }
        System.out.println(Arrays.toString(strArray));


           // day care accepts families with two or more kids, store the accepted number of kids into another array

            int[] numberOfKids = {2, 3, 1, 4, 2, 1};

            int[] dayCareAccepted = new int[numberOfKids.length];

            for(int i = 0; i < numberOfKids.length; i++){
                if(numberOfKids[i] >= 2) {
                    dayCareAccepted[i] = numberOfKids[i];
                }
            }
        System.out.println(Arrays.toString(dayCareAccepted)); //[2, 3, 0, 4, 2, 0]




        }
    }

