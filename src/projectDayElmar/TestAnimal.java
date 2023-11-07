package projectDayElmar;

import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Scanner;

public class TestAnimal {
    public static void main(String[] args) {

        // output: Please enter length of array
        //Input:5
        //Output: Enter 1 element
        //Output: Enter 2 element
        //....
        // [1,4,6,7,6]
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length of array");
        int arrLength = scanner.nextInt();
        int arrNum3 = new int[arrLength];
        for(int i = 0; i < arrLength; i++){
            System.out.println("Enter " +(i+1) + " element");
            arrNum3[i] = scanner.nextInt();

        }
 */
// Task: Find highest value
        int[] arr = {13, 4, 17, 92, 67, 37};
        //Output: //92
        //NOTE: use for loop

        int maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) { // > --> min value
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);


        // Second method : sort + out the last element


        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);


        String text = "Java is my language";
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        // language my is Java -> descending order
        // Task: avaJ si ym egaugnal


String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
           // System.out.println(words[i]);
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversed+=words[i].charAt(j);
            }
        }
        System.out.println(reversed);


        //int nums2 = {1, 0, 0, 9, 0, 5, 4, 0 ,0};

        //int[] newArr = new int[nums2.length];







    }
}
