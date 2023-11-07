package Project4;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;
        generateFibonacci(n);
    }
        public static void generateFibonacci ( int n){

            int[] fibonacci = new int[n];
            fibonacci[0] = 0;
            fibonacci[1] = 1;

            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
            System.out.println("Fibonacci Sequence:");
            for(int i = 0; i < n; i++){
                System.out.print(fibonacci[i]+" ");
            }


        }
    }

