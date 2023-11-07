package Project4;

import java.util.Arrays;

public class Task5Swap {
    public static void main(String[] args) {
        /*
        Swap Strings without using 3rd variable
         */

        String str1 = "london";
        String str2 = "UK";

        str1 = str1 + str2;// LondonUk
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);


        //second largest number from Array

        int[] numArray = {2,8,-5,4,7,11};

        Arrays.sort(numArray);
        System.out.println(numArray[numArray.length -2]);


        int[] array = {100,200,450,300,250};

        int largest = array[0];
        int secondLargest = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            }else if(array[i] > secondLargest && array[i] != largest){
                secondLargest = array[i];
            }
        }
        System.out.println("The largest number is "+largest+" and the second largest number is "+secondLargest);


        // alpha characters in a string

        String given = "1950:#98&mnlK08&v$x#@;?g56";

        String replaced = given.replaceAll("[^A-Za-z]", "");
        System.out.println(replaced.length());

        // reverse String

        //with StringBuilder/StringBuffer

        String word = "Hello CodeFish";

        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse());

        //charAt();

        String reversed = "";
        for(int i = word.length()-1; i >=0; i--){
            reversed+=word.charAt(i);
        }
        System.out.println(reversed);


        //charArray();

        String reversed1 = "";
        char[] arr = word.toCharArray();  // [H, e, l, l, o,  , C, o, d, e, F, i, s, h]
        //System.out.println(Arrays.toString(arr));

        for(int i = arr.length -1; i >= 0; i--){
            reversed1+=arr[i];
        }
        System.out.println(reversed1);

        System.out.println("=======================================");

        // using substring();
        String reversed2 = "";
        for(int i = word.length(); i >= 1; i--){
            reversed2+=word.substring(i-1, i);
        }
        System.out.println(reversed2);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        //using Java Recursion

/*
        public static String reverseString(String str){
            String str = "Good morning";
            if(str.isEmpty()){
                return str;
                return reverseString(str.substring(1) + str.charAt(0));
            }

 */

        // reverse String word by word

        String str = "I love Java";
        String reversed3 = "";
        String[] arrays = str.split(" ");
        System.out.println(Arrays.toString(arrays)); // [I, love, Java]

        for(int i = arrays.length -1; i >= 0; i--){
            reversed3+=arrays[i]+" ";
        }
        System.out.println(reversed3);


        //reverse each word in the sentence

        String string = "We love Java";
        String reversed4 = "";
        String[] array1 = string.split(" ");
        for(int i = 0; i < array1.length; i++){ // [I, love, Java]
            String words = "";
            for(int j = array1[i].length()-1; j >=0; j--){
                words+=array1[i].charAt(j);
            }
            reversed4+=words+" ";
        }
        System.out.println(reversed4);



        }


    }


