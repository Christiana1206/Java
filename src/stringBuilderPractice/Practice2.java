package stringBuilderPractice;

public class Practice2 {

    /*
    create a method that will print and return upperCae alphabet as a single StringBuilder
    test your method
     */


    public static StringBuilder upperAlphabet() {

        StringBuilder str = new StringBuilder();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            str.append(ch);
        }
        System.out.println(str);
        return str;
    }


    public static void main(String[] args) {

       // upperAlphabet();

       StringBuilder stringBuilder = upperAlphabet();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.append("!"));

        System.out.println("=======================");

        //methods

        StringBuilder builder = new StringBuilder();
        builder.append("talking is valuable");
        System.out.println(builder);

        //charAt(); for String it returns a character at a specific index number
         char c = builder.charAt(0);
        System.out.println(c); //t


       // System.out.println(builder.charAt(100)); // StringIndexOutOfBoundsException ->implemented from String charAtMethod

        //indexOf(); for String returns the index of the character we want
        System.out.println(builder.indexOf("k")); //3

        System.out.println(builder.indexOf("a", 2)); //12

        //substring(); for the String it cuts the String
        System.out.println(builder.substring(2, 5)); // lki

        //length();
        System.out.println(builder.length()); //19

        //lastIndex(); --> returning index number of the last index of matching string
        System.out.println(builder.lastIndexOf("l")); //17

        //insert(); --> can insert anything at any point that we want
        builder.insert(10, " most");
        System.out.println(builder);

        System.out.println(builder.length()); //24

        //delete();
        builder.delete(10,15);
        System.out.println(builder);

        //delete.charAt();
        builder.deleteCharAt(8);

        System.out.println(builder);

        //replace();
        builder.replace(2,5, "******");
        System.out.println(builder);








    }

}