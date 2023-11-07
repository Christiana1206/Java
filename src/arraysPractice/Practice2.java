package arraysPractice;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        String[] drinks = new String[7];
        System.out.println(drinks); // hashcode

        System.out.println(Arrays.toString(drinks)); //[null, null, null, null, null, null, null]

        // let's store some drinks
        drinks[1] = "coffe";
        drinks[2] = "water";
        drinks[5] = "milk";
        drinks[0] = "tea";
        drinks[3] = "coke";
        System.out.println(Arrays.toString(drinks)); //[tea, coffe, water, coke, null, milk, null]

        //store sparkling water to the last index dynamically(using length)

        drinks[drinks.length - 1] = "sparkling water";
        System.out.println(Arrays.toString(drinks));

        System.out.println(drinks[6]); //sparkling water

        //reach out every drink in the array and print out as >> *nameOfDrink*


        for (int i = 0; i < drinks.length; i++) {

            // print out every drink on the same lane >> *tea*coke*...*sparkling water*
            if (drinks[i] == drinks[drinks.length-1]){
                System.out.print("*"+drinks[i]+"*");
            }else{
                System.out.print("*"+drinks[i]);
            }



        }
    }
}
