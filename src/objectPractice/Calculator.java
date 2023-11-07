package objectPractice;

public class Calculator {

    /*
    create a method that will find the sum of 2 integer numbers
    print out the result by multiplying it by 10
    create another class to test your method
     */




























        public void sumOfTwo(){
            int num1 = 9, num2 = 8, sum = num1 + num2;
            System.out.println("The result is : " + (sum * 10));
        } // SOLVE ABOVE ISSUE WITH PARAMETERSCalculator calculator = new Calculator();

        public void sumOf2(int num1, int num2){
            int result = (num1 + num2)*10;
            System.out.println(" >> The Result from sumOf2 is: "+result);
        }

        //I want to create a method that will give me the result of the sum back, so I can use it in the future

    public int sumTotal(int n1, int n2){
            int result = (n1+n2)*10;
        System.out.println("In total it gives us >>>>"+result);
                    return result;
    }










}
