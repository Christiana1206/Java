package objectPractice;

import jdk.dynalink.Operation;

public class MethodPractice1 {}

    /*
    create a method to calculate your age and return it
    -- don't create a new class to test it yet
     */
    /*

    public int ageCalculator(int birthYear, int currentYear) {
        int age = currentYear - birthYear;
        return age;
    }

    public static void main(String[] args) {
        MethodPractice1 sam = new MethodPractice1();
        System.out.println(sam.ageCalculator(2000, 2023));

        //now I want to say "In 10 years your age will be ...."

        int age = sam.ageCalculator(2000, 2023);
        System.out.println("In 10 years your age will be " + (age + 10));
    }
    /*
    Create a method that will take three parameters
    it will return the result based on the operator type
    two numbers and name for operation
    ex:
    5,4, Multiply --> return 20
    5,4 Add --> return 9
    5,4 Subtract --> 1
     */
/*

    public double calculator(int n1, int n2, String operator) {
        if (operator.equalsIgnoreCase("multiply")) {
            return n1 * n2;

        }}


 */


















