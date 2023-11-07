package primitives;

public class Casting {
    public static void main(String [] args) {

        long emploeeId = 56;
         //int companyNumber = employeeId; -> compile time error. you can't store large data
        // type into a smaller data type unless you do casting.

        // explicit casting - user has to do it

        // int companyNumber = int employeeId; // hey employeeId i need you to act as an Integer -> wants o see

       // byte result = (byte)(num1+num2);

        double rate = 5.6;
        float rate1 = (float) rate; // explicit casting

        double lastRate = rate1; // implicit casting


        double percent = 78.5;
        long percentLong = (long) percent; // double is bigger then long

        System.out.println(percent);
        System.out.println(percentLong);

        long L = (long) percent;

        int count = 9;
        long countL =  count; // implicit casting

        int num5 = 128;
        byte itemNum = (byte) num5;

        System.out.println(itemNum); // -128

        System.out.println(Byte.MIN_VALUE); // -128
        System.out.println(Byte.MAX_VALUE);// 127

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);



        double falls = 20_5;
        System.out.println(falls);

        boolean bl = true;
        System.out.println(bl);

    }
}
