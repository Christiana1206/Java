package stringMethods;

import java.sql.SQLOutput;

public class Practice4 {
    public static void main(String[] args) {

        // startsWith();

        String str = "microphone";
        boolean b1 = str.startsWith("m");
        System.out.println(b1); // true

        boolean b2 = str.startsWith("micro");
        System.out.println(b2); // true

        System.out.println(str.startsWith("phone")); // false

        // endsWith();

        boolean b3 = str.endsWith("e");
        System.out.println(b3); // true

        System.out.println(str.endsWith("1")); // false

        System.out.println(str.endsWith("one")); // true

        System.out.println(str.endsWith("microphone")); // true


        // contains();

        boolean b4 = str.contains("a");

        System.out.println(b4); // false

        System.out.println(str.contains("h")); // true

        System.out.println(str.contains("one")); // true

        System.out.println(str.contains("hp")); // false

        System.out.println(str.contains("ho")); // true

        System.out.println(str.contains("h" + "o")); // true - is concatenation


        // equals();

        boolean b5 = str.equals("micro");
        System.out.println(b5);// false

        System.out.println(str.equals("Microphone")); // false - case sensetive

        String str2 = "MICROPHONE";
        System.out.println(str.equals(str2)); // false
        // str.toUpperCase();
       // System.out.println(str.equals(str2)); // false - not reassigned
        // how to reassigne:
      //  str = str.toUpperCase();
      //  System.out.println(str.equals(str2)); // true


        // equalsIgnoreCase();

        boolean b6 = str.equalsIgnoreCase("MicroPhone");
        System.out.println(b6); // true

        System.out.println(str.equalsIgnoreCase("microphone")); // true

        boolean b7 = "MICROPHONE".equalsIgnoreCase("microphone");
        System.out.println(b7); // true

        // substring();

        // str.substring(beginIndex: 5);
        // System.out.println();

        String part1 = str.substring(5);
        System.out.println(part1); // phone

        // how can i make the index 5 above dynamic

        System.out.println(str.substring(str.indexOf('p'))); // str.indexOf('p') = 5 => will print phone also

        String a = "java";
        a.substring(1);

        // char name  = str.charAt(2);


        // take string "one' from "microphone' :
        System.out.println(str.substring(7));

        //Task: take the substring 'one' from str
        // "I want to buy one new phone"
        String str1 = "I want to buy one new phone";
        System.out.println(str1.substring(14, 17));

       String part2 = str.substring(str.indexOf("one")); // dinamicly = index 7
        System.out.println(part2); // one

        System.out.println("I want to buy " + part2 + " new " +part1);

        System.out.println("==========microphone==========");

        // When i give one index, it starts from that index and gives all the way  till the end

        // what if i want to get a part of one string from a String (stops in the middle) , for ex: micro
        // micro -> i want to get "micro" from our string

        System.out.println(str.substring(0, 5)); // endIndex is not included, !! beginIndex is included

        // Task: make the above index numbers dynamic to get the word 'micro' from the str

        System.out.println(str.substring(str.indexOf('m'), str.indexOf('p')));


        System.out.println("======microphone=======");
        System.out.println(str.substring(8));
        System.out.println(str.substring(str.indexOf('o',str.indexOf('o')+1),str.indexOf('e')));








        // Task: make the above index numbers dynamic to get first part of the word from the str, second part and the middle of the word

        str = "concatination";

        System.out.println(str.substring(0 ,6));

        // dynamicly :

        System.out.println(str.substring(str.indexOf('c'), str.indexOf('i')));

        // cut "nation"

        System.out.println(str.substring(7));

        System.out.println(str.substring(str.indexOf('n', str.indexOf('n')+1)));

        // cut the string from n1 to n2

        System.out.println(str.substring(str.indexOf('n'), str.indexOf('n', str.indexOf('n')+1))); // ncati

        System.out.println(str.substring(str.indexOf('n'), str.indexOf('n', str.indexOf('n')+1)+1)); // ncatin

        System.out.println(str.substring(str.indexOf('n'), str.indexOf('n', str.indexOf('n')+1)+1)+1); //ncatin1

        System.out.println(str.substring(str.indexOf('n',str.indexOf('n')+1), str.indexOf(('n')+1, str.indexOf('n')+1))); //nati

        System.out.println(str.substring(str.indexOf('n',str.indexOf('n')+1), str.indexOf(('n')+1, str.indexOf('n')+1)+1)); //natio

        System.out.println(str.substring(str.indexOf('n',str.indexOf('n')+1))); // nation

        System.out.println(str.substring(str.indexOf('n',str.indexOf('n')+1)+1)); // ation

        System.out.println(str.substring(str.indexOf('n',str.indexOf('n')+1)+1)+1); // ation1

        System.out.println(str.substring(str.indexOf(('n')+1,str.indexOf('n')+1))); // on

        System.out.println(str.substring(str.indexOf(('n')+1,str.indexOf('n')))); // on

        System.out.println(str.substring(str.indexOf(('n')+1,str.indexOf('n')+1)+1)); // n

        System.out.println(str.substring(str.indexOf(('n')+1,str.indexOf('n')+1)+1)+1); // n1

        System.out.println(str.substring(str.indexOf('n'), str.indexOf(('n')+1, str.indexOf('n')+1))); // ncatinati

        System.out.println(str.substring(str.indexOf('n'), str.indexOf(('n')+1, str.indexOf('n')+1)+1)); // ncatinatio

        System.out.println(str.substring(str.indexOf('n'), str.indexOf(('n')+1, str.indexOf('n')+1)+1)+1); // ncatinatio1

        System.out.println(str.substring(str.indexOf('n')+1, str.indexOf(('n')+1, str.indexOf('n')))); // catinati

        System.out.println(str.substring(str.indexOf('n')+1, str.indexOf(('n')+1, str.indexOf('n')+1))); // catinati


        System.out.println(str.substring(str.indexOf('n')+1, str.indexOf(('n')+1, str.indexOf('n')+1)+1)); // catinatio

        System.out.println(str.substring(str.indexOf('n')+1, str.indexOf('n', str.indexOf('n')+1))); // cati

        System.out.println(str.substring(str.indexOf('n')+1, str.indexOf('n', str.indexOf('n')+1)+1)); // catin

        System.out.println(str.substring(str.indexOf(('n')+1,str.indexOf('n')+1), str.indexOf(('n')+1, str.indexOf('n')+1)+1)); // o



























    }
}
