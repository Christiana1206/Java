package stringMethods;

import java.util.Locale;

public class MethodChaining {
    public static void main(String[] args) {

        String str = "Saturday";

       int num =  str.toUpperCase().substring(6).replace('A', '$').indexOf('$');
        System.out.println(num);

       char ch = str.toUpperCase().substring(6).replace('A', '$').charAt(0);
        System.out.println(ch);

        // remove the leading/ending space

        String test = "       from zero to here    ";

        System.out.println(test.trim());
        System.out.println(test.trim().charAt(0)); // f
        System.out.println(test.trim().indexOf('r'));
        System.out.println(test.trim().substring(test.indexOf('r')));



        String str2 = "hava";
        System.out.println(str2.substring(2)); // va

        System.out.println(str2.substring(str2.length() - 4)); // hava
        System.out.println(str2.substring(str2.indexOf('v'))); // va

        test = "from zero to here";
      //  System.out.println(str2.substring(test.indexOf('h')));

        System.out.println(test.replace(" ", "")); // make every space to nothing






    }
}
