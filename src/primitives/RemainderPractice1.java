package primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {
         // find the sum of digits from given number
        // 12 % 10 = 2
        // 234 % 10 = 4
        // 36 % 10 = 6
        // any number modulus 10 is always the last digit

        int number = 123; // 1+2+3=6
        // created originNumber variable to keep the original value for the given number
        int originalNumber = number;
        int digit1 = number%10; //3
        number = number/10; //123%10 =12
        int digit2 = number%10; //12%10 =2
        number = number/10; //12/10 = 1
        int digit3 = number%10;  // 1%10 = 1
        int sum = digit1 + digit2 + digit3;
        System.out.println("the sum of digit in this given number " + originalNumber + " is " + sum);

        //find the product(*) of digits from given number 215 = 5 * 1 * 2 = 10;

        int num = 215;

        int originalNum = num;
        int digits1 = num % 10; // 215 % 10 = 5
        num = num /10; //215/10 = 21
        int digits2 = num%10; //21%10 = 1
        num = num/10; // 21/10 = 2
        int digits3 = num%10; //2%10 = 2
        int products = (digits1*digits2*digits3);


        System.out.println("the product of digit in this given number " + originalNum+ " is " + products);

        // TASK: find the sum of digits from given number

        int lastInt = 342;
        int originalLastNum = lastInt;

        int lastDigit1 = lastInt%10; // 342%10 = 2
        lastInt = lastInt/10; // 342/10 = 34
        int lastDigit2 = lastInt%10; //34%10 = 4
        lastInt = lastInt/10; //34/10 = 3
        int lastDigit3 = lastInt%10; //3%10 = 3
        int sumOf = (lastDigit1 + lastDigit2 + lastDigit3);

        System.out.println("the sum of digit in this given number " + originalLastNum + " is " + sumOf);

        //find the result(*) of digits from given number 764;

        int newInt = 764;
        int originalNewInt = newInt;
        int dig1 = newInt%10; // 4
        newInt = newInt/10; // 76
        int dig2 = newInt%10; // 6
        newInt = newInt/10; // 7
        int dig3 = newInt%10; // 7

        int results = (dig1*dig2*dig3);

        System.out.println("The result of given number " + originalNewInt + " is " + results);


        // TASK: find the sum of digits from given number 1261978

        int numeric = 1261978;
        int originalNumeric = numeric;
        int digital1 = numeric%10; // 8
        numeric = numeric/10; //126197
        int digital2 = numeric%10; // 7
        numeric = numeric/10; //12619
        int digital3 = numeric%10; // 9
        numeric = numeric/10; // 1261
        int digital4 = numeric%10; // 1
        numeric = numeric/10; // 126
        int digital5 = numeric%10; // 6
        numeric = numeric/10; // 12
        int digital6 = numeric%10; // 2
        numeric = numeric/10; // 1
        int digital7 = numeric%10; // 1

        int amount = digital1+digital2+digital3+digital4+digital5+digital6+digital7;

        System.out.println("The numerology destiny number of given date of birth " + originalNumeric + " is " + amount);

        //find the product(*) of digits from given number 987

        int numer = 987;
        int originalNumer = numer;
        int digitc1 = numer%10; // 7
        numer = numer/10; // 98
        int digitc2 = numer%10; // 8
        numer = numer/10; // 9
        int digitc3 = numer%10; // 9
        int mlpln = digitc1*digitc2*digitc3;

        System.out.println("The multiply of digits of given number " + originalNumer + " is " + mlpln);
    }
}
