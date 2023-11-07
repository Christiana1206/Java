package ternaryOperator;

public class Practice1 {
    public static void main(String[] args) {


        int num1 = 6, num2 = 3;

        // num2 < num1 ? "Alex" : "David"; --> you cannot leave ternary by itself, either store it/use it

        String result1 = num2 < num1 ? "Alex" : "David";

        System.out.println(result1); // Alex


        // ? -> question the condition
        boolean result2 = num1 == num2 ? true : false;
        System.out.println(result2); // false

        double money = 25.50, tax = 13.5;

        String str = money > 20 || tax < 10 ? "you will pay extra" : "you will be Ok";
        System.out.println(str); // you will pay extra

        System.out.println(num1 != num2  ? "Hello" : "Buy"); // Hello

        System.out.println(num1 + 5 >= num2*2-4 ? num1*10 : num2);

    }
}

