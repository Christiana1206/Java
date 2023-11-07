package projectDayElmar;

public class PalindromeString {
    public static void main(String[] args) {


        String str = "abbcbba";

        //a*****a
        //b***b
        //

        for(int i =0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() -1 -i)){
                System.out.println("Is not Palindrome");
            }

        }
        String bucket = "";

        if(str.length()%2 != 0){
            for(int i = 0; i < str.length()/2 + 1; i++){
                bucket = str.substring(i, str.length() - i);
                System.out.println("i: "+i+" , str.length() -i: "+bucket);
                System.out.println(bucket);
            }
        }else{
            System.out.println(str.substring(1));
        }
    }



}
