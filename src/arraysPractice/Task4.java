package arraysPractice;


import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] ages = {23, 15, 23, 7, 56, 40, 3, 56, 56}; // in the array same data/value can be repeated (can be stored multiple times)

        /*
        find out the oldest age from array (find the largest number)
        Buble Sorting algorithm

        find out the youngest age from array(find the smallest number)
         */

        int largest = ages[0]; // automatically the largest is very first number
        int smallest = ages[0];

        for(int i = 1; i < ages.length; i++){
            if(ages[i] > largest){
                largest = ages[i];
            }else if(ages[i] < smallest){
                smallest = ages[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);

    }
}
