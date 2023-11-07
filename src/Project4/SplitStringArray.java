package Project4;

import java.util.Arrays;

public class SplitStringArray {
    public static void main(String[] args) {

        String str = "CodeFish";

        String[] array = str.split("");
        System.out.println(Arrays.toString(array)); //[C, o, d, e, F, i, s, h]

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

            for(String elements : array){
                System.out.println(elements);
            }
        }
    }

