package HomeWork;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        String numberString = String.valueOf(number);

        int sum = 0;

        for(int i = 0; i < numberString.length(); i++){
            int digit = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            sum+=digit*digit*digit;
        }
        //System.out.println(sum);


            if(number == sum){
                System.out.println(number+" is an Armstrong number");
            }else{
                System.out.println(number+" is not an Armstrong number");
            }
        }



    }

