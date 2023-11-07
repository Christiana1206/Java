package stringBuilderPractice;

public class Practice7Sara {
    /*
    // create a method to take a string and return the reversed version of it

    public static String stringReverser(String str){

        String reversed = "";
        for(int i = str.length()-1; i >=0; i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }

     */

    public static void main(String[] args) {

        //String str = "Interview";
        //System.out.println(stringReverser(str));

        //reverse()
        StringBuilder builder = new StringBuilder("Interview");
        System.out.println(builder.reverse());

    }




}
