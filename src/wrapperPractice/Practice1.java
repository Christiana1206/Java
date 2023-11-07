package wrapperPractice;

public class Practice1 {
    public static void main(String[] args) {


        String str = new String("Good");
        String str1 = "Morning";

        byte b = 3;

        Byte bt1 = new Byte(b);  // Byte bt1 = new Byte((byte)3);
        System.out.println(bt1); // 3

        Byte bt2= new Byte((byte)150);
        System.out.println(bt2); // -126


        short sh = 5;
        Short sh1 = new Short(sh);

        Integer i = new Integer(45);

        Character ch = new Character('t');

        Boolean bl = new Boolean(true);
        System.out.println(bl); // true

        Boolean bl2 = new Boolean("TRUE");
        System.out.println(bl2); // true

        Integer number = 4; // Autoboxing -> when java converts primitive to wrapper class object
        number.byteValue();

       // number. --> can use object methods; ll methods are available, because When we started with capital one -->
        // it becomes the object version of it, and Java converted it automatically to wrapper version,
        // and now it's object wrapper class version
        System.out.println(number*2+10-4); //14 --> wrapper class integer is still as regular number


        int i1 = number; // unboxing -> when Java converts wrapper class objects to the primitive types

        //  i1. // --> not object, no method available, just normal primitive data types







    }
}
