package primitives;

public class ArithmeticPractice1 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        //+ --> addition
        System.out.println(num1+num2);
        int sum = num1 + num2;
         System.out.println(sum); //12
        // - --> subtraction

        int num3 = sum - 4;
        System.out.println(num3); //12-4=8

        sum = num3 - num1 +2; //reassigning
        System.out.println(sum); //8-5+2 =5

        // * - --> multiplication
         int product = sum*sum;
         System.out.println(product); //5*5=25
        System.out.println(5*sum*0); // 0

        // / --> division
        int division = 30/num1;
        System.out.println(division); // 30/5 = 6

        double division1 = 30/4.5;

        int division2 = 30/4;
        System.out.println(division2); //7

        // & --> modulus --> find and give remainder from division

        int number3 = 17;
        int number4 = 5;
        int remainder = number3 % number4;
        System.out.println(remainder); //2

        // diff between / and %
        System.out.println(11/2); //5
        System.out.println(11%2); //2


    }
}
