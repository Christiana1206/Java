package objectPractice;

public class TestCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.sumOfTwo();

        calculator.sumOf2(5,4);
        calculator.sumOf2(11,88);

        System.out.println("====+++++=====+++++=====");

        System.out.println(calculator.sumTotal(10,10)); //200

        int total1 = calculator.sumTotal(11,11);
        System.out.println(total1);



        }



    }

