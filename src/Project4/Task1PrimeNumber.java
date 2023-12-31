package Project4;

import java.util.Scanner;

public class Task1PrimeNumber {
    public static void main(String[] args) {
        /*
        Prime Number:
        Prime number is a number that can be divided
        by 1 or by itself only. For example 7 is Prime
        Number because it can be divided into 7 or 1, but
        not to any number. For instance if we divide 7 by 2
        we would get decimal answer
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you would like to check");

        int num = scanner.nextInt();

        boolean flag = true;

        if(num <= 1){
            flag = false;
        } else {
            for (int i = 2; i*i <= num ; i++){
                if(num%i == 0){
                    flag = false;
                    break;
                }

            }
        }
        if (flag){
            System.out.println(num + " is a Prime Number");
        }else{
            System.out.println(num + " is not a Prime Number");
        }

    }
}
