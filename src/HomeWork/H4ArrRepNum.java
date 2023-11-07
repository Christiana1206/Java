package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class H4ArrRepNum {
    public static void main(String[] args) {


        // Create the array on lines above

        //User is asked for a number below. Please get the number using scanner.
        System.out.println("Please enter number from array");

        int[] array = {10,4,3,55,32,145,443,234,98,32};

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean found = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == number) {
                array[i] = 0;
                found = true;
                break;
            }
        }
        if(found){
            //System.out.println(Arrays.toString(array));
            printArray(array);
        }else{
            System.out.println("false");
        }
        scanner.close();
    }

    public static void printArray(int[] array){
        for(int i =0; i < array.length; i++){
            System.out.print(array[i]+"");
        }
       // System.out.println();
    }
}





