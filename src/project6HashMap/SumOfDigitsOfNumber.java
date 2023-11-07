package project6HashMap;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {


        int number = 247;

        String numberString = String.valueOf(number);

        int sum = 0;

        for(int i = 0; i < numberString.length(); i++){
            int digit = Integer.parseInt(String.valueOf(numberString.charAt(i)));
            sum+=digit;
        }
        System.out.println(sum);
    }
}
