package arraysPractice;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        /*
        create an array to store the following numbers: -20, 18, 7, -7, 5, 38, 8, 2
        --> print out only numbers which are greater than 2 and store into another array
         */

       int[] numbers = {-20, 18, 7, -7, 5, 38, 8, 2};


        int[] numGreater2 = new int[numbers.length];

       // System.out.println(Arrays.toString(numbers));

        for( int i = 0; i < numbers.length; i++) {

            if(numbers[i] > 2) {
                numGreater2[i] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numGreater2));


    }
}
