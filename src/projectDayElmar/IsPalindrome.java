package projectDayElmar;

public class IsPalindrome {

    //Task: Write method where it should return is number palindrome or not.
    //HINT: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    //Input:  12321
    //Output: true
    //Input: 1241
    //Output: false

    //Task2:

    public boolean isPalindrome() {

        int number = 1234567;

        int endNumber = number % 10; //
        System.out.println(endNumber);
        return false;
    }

        /*
        number /= 10;
        reverseNumber = reverseNumber *10 + number % 10;

        System.out.println(reverseNumber);
        System.out.println(number);

        while (number > 0) {
            reverseNumber*10 + number%10



         */



/*
        //logic
        return false;
*/

    public static void main(String[] args) {
        IsPalindrome palindrome = new IsPalindrome();
        palindrome.isPalindrome();


    }






    }



