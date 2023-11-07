package ifStatements;
import java.util.Scanner;
public class NestedPractice3 {
    public static void main(String[] args) {
/*
TASK
Illinois requires vehicles to get inspected every other year.
If your car's year is even it will be inspected next year (2024).
If your car's year is odd, it will be inspected this year (2023).
 If you get your car inspected this year, Your options are:
  to go to DMV office or nearest fire stone store location depending on your home distance to DMV.
    – You can go to the nearest fire stone store. If DMV distance is 5 miles or more from your home.
    when you go to the DMV, the inspection is free of charge
    when you go to fire stone inspection is $30 plus 10% tax
    Let user know about their payment based on the information they provided
     if their inspection falls into next year, tell user "Wait for another year for inspection"
     */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your car's year :");
        int carYear = scanner.nextInt();
        if (carYear % 2 == 0) {      // it's even
            System.out.println("Wait for another year for inspection");
        } else {
            System.out.println("How far is your home from DMV in miles");
            int distanceFromDMV = scanner.nextInt();

            if (distanceFromDMV >= 5) {

                double inspectionFee = 30;
                double tax = inspectionFee * 0.1;

                System.out.println("Your total inspection is $ " + (inspectionFee + tax));

            } else {

                System.out.println("Your inspection is free at the DMV");
            }


        }

    }
}
