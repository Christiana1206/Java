package primitives;

public class ComparisonPractice {

    public static void main(String [] args) {

        int number1 = 4,  number2 = 4;
         System.out.println("======Equals to =================");
         System.out.println(number1==number2);


         boolean result1 = number1==number2;
         System.out.println(result1==false); // true == false --> false

        number2 = 7; // reassign
        System.out.println(number1==number2); //false

        System.out.println((result1==false)==(number1==number2)); // F=F --> true

        System.out.println(8.7==7.8); //--> false


        number1 = 8;
        float num1 = 8, num2 = 6, num3 = 9-1;

        boolean result2 = num1 != num2; //true
        System.out.println(result2);

        boolean result3 = number1 !=num1;
        System.out.println(result3); // false
        System.out.println(8!=8.0); //false

        double count1 =12.5, count2 = 12.5, count3 = 50;

        //System.out.println(count1>2count2); // false










    }
}
