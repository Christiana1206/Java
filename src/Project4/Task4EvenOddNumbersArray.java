package Project4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task4EvenOddNumbersArray {
    public static void main(String[] args) {
        /*
         Find even numbers and odd numbers from an array and store them
     separately in 2 different arrays.
         */

        int[] numbers = {12, 5, 17, 8, 22, 34, 16, 19, 11, 27};
        int countEven = 0;
        int countOdd = 0;

        for(int n : numbers){
            if(n%2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }


        int[] evenArray = new int[countEven];
        int[] oddArray = new int[countOdd];

        int indexEven = 0;
        int indexOdd = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 == 0) {
                evenArray[indexEven] = numbers[i]; // or:  evenArray[indexEven++] = numbers[i];
                indexEven++;
            }else{
                oddArray[indexOdd] = numbers[i]; // or:  evenArray[indexOdd++] = numbers[i];
                indexOdd++;
            }
        }
        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));




    }
}
