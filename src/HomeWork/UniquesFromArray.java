package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class UniquesFromArray {
    public static void main(String[] args) {


//store every number by asking user via scanner in the loop

        int[] nums = new int[13];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < nums.length; i++) {
            System.out.println("Enter number for array "+i+":");
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int j = 0; j < nums.length; j++)
            numbers.add(nums[j]);

        System.out.println(numbers);


        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
        }


        System.out.println(set);
    }
}
