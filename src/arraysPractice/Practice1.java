package arraysPractice;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        // create an integer array

        int[] numbers = new int[5];

        int a = 9;
        System.out.println(a); //9

        System.out.println(numbers); // hashcode

        // to print out array, you need to use Arrays.toString(nameOfArray)
        System.out.println(Arrays.toString(numbers)); //[0, 0, 0, 0, 0]


        numbers[0] = 3;
        System.out.println(Arrays.toString(numbers)); //[3, 0, 0, 0, 0]

        //store 8 to index 3
        numbers[3] = 8;
        System.out.println(Arrays.toString(numbers));

        //if I want to print or reach out a single element of an array -> call the name of my array and specify which index you want

        System.out.println(numbers[0]);//3


        // how can we store this
        int num1 = numbers[0];
        System.out.println(num1);//3
        System.out.println(num1 == numbers[0]);// true

        //reassign a value

        numbers[0] = 17;
        System.out.println(numbers[0]); //17
        System.out.println(num1); //3 ????????????
        System.out.println(Arrays.toString(numbers)); //[17, 0, 0, 8, 0]

        //store value 9 to the last index number from the array
        numbers[4] = 9;
        System.out.println(Arrays.toString(numbers)); //[17, 0, 0, 8, 9]


        // check the size of array

        int size = numbers.length; //property ot the array
        System.out.println(size);


        //store value 9 to the last index number from the array dynamically
        numbers[numbers.length - 1] = 19;
        // or numbers[4] = 19;

        //  numbers[numbers.length] = 5; don't work
        System.out.println(numbers.length); //5

        System.out.println(Arrays.toString(numbers)); //[17, 0, 0, 8, 19] - reassigning implement



        //   numbers[-1] = 77; // arrayIndexOutOfBoundsException
        //  System.out.println(Arrays.toString(numbers));

        System.out.println("=============================");

        numbers[1] = 4;
        numbers[2] = 23;
        System.out.println(Arrays.toString(numbers));

        // print out every single element from the array one by one


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
/*
            //print out the values next to each other, separated by a dash: 17 - 4 - 23 - 8 - 19

            if (i == numbers.length - 1) { // if(numbers[i] ==numbers[numbers.length-1]){

                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + " - ");
            }
 */
        }

    }
}
