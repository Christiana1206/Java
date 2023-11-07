package ternaryOperator;

public class Practice3 {
    public static void main(String[] args) {
        // TESTED TERNARY

        String str = "flower";
        int num1 = 9;

       String result1 =  str.contains("low")  ? num1 > 1? "Red" : "Blue" :"White";
        System.out.println(result1); // red


        System.out.println("================");

        String result2 = str.contains("l")   ? num1 >= 11 ? "Red" : "Blue" : num1 == 1 ? "Pink" : "Green";
        System.out.println(result2); // Blue

        System.out.println(str.contains("x") ? num1>= 11 ? 100 : "Blue" : num1 == 9 ? 200 : 'A'); // 200 or E in Ascii Table
       // char asciiValue =200;
      //  System.out.println(asciiValue); //E




    }
}
