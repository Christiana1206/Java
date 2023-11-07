package stringMethods;

public class StringPoolPractice {
    public static void main(String[] args) {


        System.out.println("== vs. equals");

        //.equals()


        String name1= "david";
        String name2 = "david";

        String name3 = new String("david");
        String name4 = new String("david");

        System.out.println(name1.equals(name2)); // true
        System.out.println(name1.equals(name3));  // true
        System.out.println(name3.equals(name4));  // true

        System.out.println("===========");


        // == comparison operator

        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // false
        System.out.println(name3 == name4); // false

        String name5 = name1;
        System.out.println(name5==name1);  // true

        String name7 = new String("DAVID");
        System.out.println(name1.equals(name7)); // false
        System.out.println(name7.toLowerCase().equals(name2)); // true
        System.out.println(name2.toUpperCase() == name7); // false




    }
}
