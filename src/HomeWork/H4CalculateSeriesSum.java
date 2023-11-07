package HomeWork;

import java.util.Scanner;

public class H4CalculateSeriesSum {
    public static void main(String[] args) {

        System.out.println("Enter number of terms of series :");
        Scanner scanner = new Scanner(System.in);
        int n = new Scanner(System.in).nextInt();

        double sum = calculateSeriesSum(n);
        System.out.println("The sum of the series is: "+sum);
    }
    public static double calculateSeriesSum(int n){
        double sum = 0.0;

        for(int i = 1; i <= n; i++){
            sum+=1.0/i;
        }
        return sum;
    }
}
