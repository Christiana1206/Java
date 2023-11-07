package primitives;

public class Practice1 {
    public static void main(String[] args) {

        //byte -128 to 127 - this the limit the byte can take
        byte b1 = 100;
        byte b2 = 127;
        System.out.println("Byte value: " + b1);

        short sh1 = -129;
        short sh2 = 10;
        int int1 = 443795984; // int is gridyer than byte and short
        int int2 = 1;
        int int3 = 32000;
        System.out.println(int3);

        //long data type
        long l1 = 1034323;

        float f1 = 1.1f;
        System.out.println("Float value is: " + f1);

        //double
        double d1 = 5.5;
        System.out.println("Double value is " + d1);
         double d2 = 15; // 15.0
         System.out.println("Another double value: " + d2);

         boolean bool1 = true;
         boolean bool2 = false;
         // true, false are Java reserved keywords
        System.out.println("First boolean value is: " + bool1);
        System.out.println("Second boolean value is: " + bool2);

        //char
        char ch1 = 'A';
        // char ch2 = "A"; // w'ont work
        // char ch3 = 'Ab'; // w'ont work, only single character

        System.out.println("Character value is " + ch1);

        char ch4 = 'C';
        char ch5 = 'C'; // it's possible
        System.out.println(ch1 + 1);
        //65 + 1 = 66

        char ch6 = '!';
        char ch7 = '3';
        char ch8 = ';';

        System.out.println(ch8);





    }
}
