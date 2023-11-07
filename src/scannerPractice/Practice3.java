package scannerPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        /*
    find out Body Mass Index(BMI) for user
    The formula for BMI is wight in kilograms divided by height in meters squared.
    BMI = weight/(height *height)

    take weight(kg) and height(meters) of the person by using scanner
    tell that person what his BMI is/ show result on screen

    If your BMI is 18.5 to 24.9, it falls within the Healthy Weight Range.
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight in kg");
        double weightOfPerson = input.nextDouble();
        System.out.println("Please enter your height in meters ");
        double heightOfPerson = input.nextDouble();

        double BMI = weightOfPerson/(heightOfPerson*heightOfPerson);

        System.out.println("Your BMI is: " +BMI);

        System.out.println("If your BMI is 18.5 to 24.9, it falls within the Healthy Weight Range");





    }
}


