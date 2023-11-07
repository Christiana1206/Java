package recap;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {

        String str1; //Null is the default value // declare

        String str = "Hello"; // in this case hello is already put from pool of string  //initialize


        String str2 = new String("Hello"); //you are like forcing the system to create a new string instead of polling from the pool

        char [] chars = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars); // by passing the array of characters

        StringBuilder stringBuilder = new StringBuilder("Java");
        String str4 = new String(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Java");
        String str5 = new String(stringBuffer);

        //Methods
        //to find out the length of the string
        int size = str.length();
        long size1 = str.length(); //it's casting the integer

        //
        int ind = str.charAt(str.length()-1);
        System.out.println(ind); // 111 - Ascii Table

        String word = "america";
        System.out.println(word.replace('a', 'k'));
        System.out.println(word);

        // startWith() and endWith()


        boolean startWithW = word.startsWith(" ");
        System.out.println(startWithW);

        boolean endWith = word.endsWith("america");
        System.out.println(endWith);


        //isEmpty()

        word = "";
        boolean isEmpty = word.isEmpty();
        System.out.println(isEmpty); //true
       // word = null;
       // boolean isEmpty = word.isEmpty();

       // System.out.println(isEmpty); // NullPointerException - manipulation with null is manipulation with default value

        //contains()

        //split

        String name = "Donald Trump";
        //String [] name1 = name.split("");
        System.out.println(Arrays.toString(name.split(""))); //[D, o, n, a, l, d,  , T, r, u, m, p]
        System.out.println(Arrays.toString(name.split(name))); // []

        //compare() return integer 1, 0, -1 Ascii Table

        System.out.println("a".compareTo("b")); // -1 97 98
        System.out.println("b".compareTo("a")); // 1

        name.toCharArray(); //split("");

        String str6 = new String("abc"); //abc


        char[] chs = {'a','b','c'};

        String str7 = new String(chs); //abc


        StringBuilder strb = new StringBuilder("dfg");
        String str8 = new String(strb); //dfg

        StringBuffer strbuff = new StringBuffer("hij");
        String str9 = new String(strbuff); //hij

       int num =1;

      // num++; //post increment //2
        System.out.println(num++); //1

       // ++num; //pre increment //3
        System.out.println(++num); //3





    }
}
