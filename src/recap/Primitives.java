package recap;

public class Primitives {
    public static void main(String[] args) {

        byte byte1 = -128; // -129 , 128 will complain
        byte byte2 = 127;

        short short1 = 0; // 5 digits max
        short short2 = -1; // 5 digits with minus

        short shortNum1 = (short) (short1 + short2);  // short shortNum1 = short1 + short2;
        short shortNum2 = (short) (short1 - short2);

        int num1 = Integer.MAX_VALUE; // 2147483647 //press control to see the method and the value
        int num2 = Integer.MIN_VALUE; //-2147483648

        long longNum1 = 1023456789; // 10 digits
        long longNum2 = -1023456789; // 10 digits with minus

        //decimals

        double double1 = 1241.23112;
        float float1 = 123.677f;

        System.out.println("=====================================");
       double double3 = (double) float1;
        System.out.println(double3); //1241.2310791015625

        char letter = 'a'; // "a";
        int num5 = (int) letter;
        System.out.println(num5); //97

        int diff = 5 -letter;
        System.out.println(diff); // -92

        long  longNum = 2183589099999L;
        long longNum4 = 218358999;

        boolean bool1 = true;








    }
}
