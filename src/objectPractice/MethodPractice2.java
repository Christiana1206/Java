package objectPractice;

public class MethodPractice2 {

    //create a Java Method to find and return sum of numbers in an array


    public double sumOfArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

//Overload this sumOfArray method

    public double sumOfArray() {
        return 0;
    } // i'm overloading because I created the same method in the same class with different parameters

    public double sumOfArray(double num1, double num2) {

        return num1 + num2;
    }

    //Overload sumOfArray method that can find the sum of numbers from an array for only the first 5 elements

    public double sumOfArray(int[] numbers, int limit) {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += numbers[i];
        }
        return sum;


    }

    public static void main(String[] args) {
        MethodPractice2 obj1 = new MethodPractice2();

        int[] array = {4, 6, 8, 9, 2, 13, 5};
        System.out.println(obj1.sumOfArray(array));//47

        obj1.sumOfArray();
        double d1 = obj1.sumOfArray();
        System.out.println(d1);

        double d2 = obj1.sumOfArray(10,10);
        System.out.println(d2);


        double result = obj1.sumOfArray(array, 5); //42
        System.out.println(result);

      //  double sum = obj1.sumOfArray(array, 5);
        //System.out.println(sum);


    }
}
