package stringBuilderPractice;

public class Practice7 {

    // create a method to take a string and return the reversed version of it

    public static StringBuilder reverseString(String str){

        String reversed = "";
        for(int i = str.length()-1; i >=0; i--){
            reversed+=str.charAt(i);


        }
        return new StringBuilder(reversed);
    }

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Interview");

       // reverseString(stringBuilder.toString());

        System.out.println(reverseString(stringBuilder.toString()));
    }

}


