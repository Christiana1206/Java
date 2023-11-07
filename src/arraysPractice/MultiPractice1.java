package arraysPractice;

import java.util.Arrays;

public class MultiPractice1 {
    public static void main(String[] args) {

        //firstNum in the [] -> capacity of larger array
        //secondNum in the [] -> capacity of the inner array

        int[][] numbers = new int[4][3];
        //System.out.println(Arrays.toString(numbers)); // --> HASHCODE
        System.out.println(Arrays.deepToString(numbers)); //  [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]

        //i want to print out the very first element

     //   System.out.println(numbers[][]); //0


        // store 500 to the last box last position dynamically



       // numbers[3][2] = 500;

        numbers[numbers.length-1][numbers[numbers.length-1].length-1] = 500;

        System.out.println(Arrays.deepToString(numbers));

        int num = numbers[numbers.length-1][numbers[numbers.length-1].length-1];
        System.out.println(num);
        System.out.println("===================================");








        int [][] subsequence = new int [5][4];

        System.out.println(Arrays.deepToString(subsequence));

        int element;

        element = subsequence[subsequence.length-1][subsequence[subsequence.length-1].length-1];
        System.out.println(element);

        subsequence[4][3]= 300;
        System.out.println(subsequence[subsequence.length-1][subsequence[subsequence.length-1].length-1]);


        System.out.println(Arrays.deepToString(subsequence));
        System.out.println(element); //0


        System.out.println(subsequence.length); //5
        System.out.println(subsequence[1].length); //4
    }
}
