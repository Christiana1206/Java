package arraysPractice;

import java.util.Arrays;

public class practice3 {
    public static void main(String[] args) {


        //Acceptable syntax version when creating an integer array

        int[] numbers = new int[5];
        int numbers1[] = new int[5];
        int[] numbers2 = new int[5]; // --> spaces don't effect
        System.out.println(Arrays.toString(numbers2)); // [0, 0, 0, 0 , 0]

        numbers2[0] = 3;
        numbers2[1] = 4;
        System.out.println(Arrays.toString(numbers2)); //[3, 4, 0, 0, 0]

        // second way to create an array: only when I know for sure   and the values 5, 7, 3, 12, 6, 2

        int[] ids = {5, 7, 3, 12, 6, 2}; // size -> 6, index -> 5
        System.out.println(Arrays.toString(ids)); //[5, 7, 3, 12, 6, 2]
        System.out.println(ids.length); //6

        //reassign value:
        ids[1] = 18;
        System.out.println(Arrays.toString(ids));



        //proof that capacity is fixed
        int[] nums = {};
        System.out.println(nums.length); //0
        //nums[0] = 9;
       // System.out.println(Arrays.toString(nums)); // capacity is fixed, you can't put  inside

        /*
        can you show student ids one at a time then multiply the result by 10 >> 5 -> 5*10 = 50;


        for (int i = 0; i < ids.length; i++){
            System.out.println(ids[i]*10);
        }
         */
         // task2: store the new numbers into another array

        int[] times10Value = new int[ids.length];

        for (int i = 0; i < ids.length; i++){
            System.out.println(ids[i]*10);
            times10Value[i] = ids[i]*10;
        }
        System.out.println(Arrays.toString(times10Value));





    }


    }

