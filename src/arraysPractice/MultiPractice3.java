package arraysPractice;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MultiPractice3 {
    public static void main(String[] args) {


        int[][] test = {{2, 3, 6, 7}, {4, 5, 3}, {1, 6, 7}, {1, 2, 8, 8}, {2}};

        // i want to print the size of each array .. 4, 3, 3, 4, 1

        // store the value into a new array called lengthOfEachArray


        int[] lengthOfEachArray = new int[test.length];

        for (int i = 0; i < test.length; i++) {

            //  for(int j = 0; j < test[i].length; j++){

            System.out.println(test[i].length);

            lengthOfEachArray[i] = test[i].length;
        }
        System.out.println(Arrays.toString(lengthOfEachArray));
    }

























/*

        int[] lengthOfEachArray = new int[test.length]; //instead of 5

        for (int i = 0; i < test.length; i++) {
            // test[0].length ->4
            // test[1].length ->3
            // test[2].length ->3
            // test[3].length ->4
            // test[4].length ->1

            System.out.println(test[i].length);

            lengthOfEachArray[i] = test[i].length;

        }
        System.out.println(Arrays.toString(lengthOfEachArray));


 */

    }







