package Project4;

import java.util.Arrays;

public class StringConvertToArray {
    public static void main(String[] args) {
        /*
         Take the sentence from string and convert it into an array and reverse from
    that array only the ones whose index is even.
         */

        String sentence = "We love Java a lot";

        String[] eachWord = sentence.split(" ");

        System.out.println(Arrays.toString(eachWord)); //[We, love, Java, a, lot]
        System.out.println(eachWord.length);

        for(int i = 0; i < eachWord.length; i++){
            String reversed = "";
            if(i%2 == 0){
               for(int j = eachWord[i].length()-1; j>=0; j--){
                   reversed+=eachWord[i].charAt(j);
               }
            }else{
                reversed = eachWord[i];
            }
            System.out.println(reversed);
        }


    }
}
