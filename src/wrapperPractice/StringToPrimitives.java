package wrapperPractice;

public class StringToPrimitives {

    public static void main(String[] args) {


        String str1 = "10";
        String str2 = "20";
        System.out.println(str1 + str2); //1020

        //I want to convert these String to the number format
        //parsing > converts the string to the dataTypes you want

        int number = Integer.parseInt(str1);
        System.out.println(number); //10
        System.out.println(number * 4 + 55); //95 --> actually does calculation

        String str4 = "I am here456";
        // Integer.parseInt(str4); --> will be NumberFormatException

        String str5 = "1234567";
        System.out.println(Integer.parseInt(str5) + 4); //1234567 +4 = 1234571

        /*
        money 100.25 is stored inside a String
        find out what is 1/4 of your money
        if 1/4 of your is enough to buy a book which costs $25.0
        tell me if you can buy the book or not
         */

        String money = "100.25";

        double bookPrice = 25.0;

        double realMoney = Double.parseDouble(money);

        if (realMoney / 4 > 25.0) {

            System.out.println("you can buy the book");
        } else {
            System.out.println("you are short on money");

        }

        // My version:
        boolean enoughToBuyBook = Double.parseDouble(money) / 4 >= bookPrice;
        System.out.println(enoughToBuyBook);

    // ternary operator:

        System.out.println(realMoney/4 >= 25 ?   "**you can buy the book**" : "**you are short on money**");

        //From String to Wrapper class data?

        String str6 = "123";
        Integer num1 = Integer.parseInt(str6);


        //primitive to the String conversion
        char ch = 'm';
        String str7 = ""+ch;

        //valueOf()
        String str8 = String.valueOf(ch);
        System.out.println(str8.concat("--> letter as a String"));

        Boolean b1 = false;
        String str10 = String.valueOf(b1);

        Character ch2 = 'N';
        //toString()
        String str9 = ch2.toString();
        System.out.println(str9.concat("<><><>"));











    }
}
