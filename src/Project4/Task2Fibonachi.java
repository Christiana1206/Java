package Project4;


public class Task2Fibonachi {
    public static void main(String[] args) {
        /*
         Fibonacci - is sequence of numbers. For example this is a number
                which as a result of 2 previous numbers' addition
                we get the result of the 3rd number
                For instance 1 + 1 is 2, 1+ 2 is 3, 2+3 is 5 and so on
         */


        int number = 10;
        int first = 0;
        int second = 1;

        for (int i = 0; i < number; i++) {

            int next = first + second;
            first = second;
            second = next;
            System.out.print(first + " ");
        }

        int n = 10;

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];


            System.out.print(fibonacci[i] + " ");
            // for(int i = 0; i < n; i++){
            //  System.out.print(fibonacci[i]+" ");
        }


    }

        }




