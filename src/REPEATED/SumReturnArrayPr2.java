package REPEATED;

public class SumReturnArrayPr2 {

    //create a Java Method to find and return sum of numbers in an array

    public double sumOfArray(int[] numbers) {

        int sum = 0;
        for (int num : numbers) {
            sum += num;

        }
        return sum;
    }
    public double sumOfArray(int[] numbers, int limit) {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += numbers[i];
        }
        return sum;

    }
    public static void main(String[] args) {

        SumReturnArrayPr2 object = new SumReturnArrayPr2();

        int[] array = {7, 10, 20, 5, 15, 8};

        System.out.println(object.sumOfArray(array)); //65

        double result = object.sumOfArray(array, 5); //42
        System.out.println(result);


    }


    }




