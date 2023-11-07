package ternaryOperator;

public class Practice2 {
    public static void main(String[] args) {

        int x = 2, y = 5;

       int result1 =  x < y ? x++ +10 : y++ +10;
        System.out.println(x);
        System.out.println(result1); // 12

        System.out.println("x >>" +x); // 3


    }
}
