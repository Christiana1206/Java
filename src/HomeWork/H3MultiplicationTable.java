package HomeWork;

import java.util.Scanner;

public class H3MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for(int n = 1; n <= 10; n++){

            System.out.println(num+" * "+n+" = "+num*n);
        }
    }
}
