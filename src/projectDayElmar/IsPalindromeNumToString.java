package projectDayElmar;

public class IsPalindromeNumToString {

    //Task: Write method where it should return is number palindrome or not.
    //HINT: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    //Input:  12321
    //Output: true
    //Input: 1241
    //Output: false

    public static boolean isPalindrome(int number){
        String str = String.valueOf(number);
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }


    public static void main(String[] args) {

        int number = 12321;
        if(isPalindrome(number)){
            System.out.println(number+" is a palindrome");
        }else{
            System.out.println(number+" is not a palindrome");
        }
    }

}
