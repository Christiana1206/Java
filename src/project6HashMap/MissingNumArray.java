package project6HashMap;

import java.util.Arrays;

public class MissingNumArray {
    public static void main(String[] args) {

        //only for number from 0 to 9 and only find one missing number


        int[] arr = {1, 8, 0, 5, 4, 2, 9, 3, 6};

        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr)); //[0, 1, 2, 3, 4, 5, 6, 8, 9]


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {

                System.out.println(i);
                break;
            }


        }
    }
}
