package stringBuilderPractice;

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {

        /*
        if the word's length is odd number
        Replace middle char with a $ from each word in a StringBuilder array
         */

        StringBuilder[] array = new StringBuilder[5];
        StringBuilder[] brand = {new StringBuilder("bakkara"), new StringBuilder("nike"), new StringBuilder("sketchers"), new StringBuilder("coach"), new StringBuilder("converse")};

        for(int i = 0; i < brand.length; i++){
            //System.out.println(brand[i]);
            if(brand[i].length()%2 != 0){
               brand[i].replace(brand[i].length()/2, brand[i].length()/2+1, "$");

                System.out.println(brand[i]);
            }

        }
        System.out.println(Arrays.toString(brand));

    }
}
