package arraysPractice;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {

        int[] ages = {23, 15, 23, 7, 56, 40, 3, 56, 56, 56, 100, 7, 19};

        System.out.println(Arrays.toString(ages));

        // sort
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        //find the smallest number
        System.out.println(ages[0]);

        //find the largest number
        System.out.println(ages[ages.length-1]);

        System.out.println("===================================");

        String[] colors = {"red", "blue", "White", "brown", "black", "pink", "purple", "orange"};
        System.out.println(Arrays.toString(colors));

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

        // it will sort them alphabetically








    }
}
