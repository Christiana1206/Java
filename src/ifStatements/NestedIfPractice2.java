package ifStatements;
import java.util.Scanner;
public class NestedIfPractice2 {
    public static void main(String[] args) {
        /*
User has arrived at the OHare security checkpoint
-->Check the user for their passport
    ->Check the user if they have either a ticket to fly or if they are flying using their own jet(ticket/jet)
        If they have a ticket Check if the weight of the user's luggage is less than 40 pounds
            -"you are good to FLY"
            -"your luggage is over the weight limit, please make sure it is under 40 pounds"
        If they are flying by their own jet
            -"have a good travel
        If neither ->"you need to buy a ticket to fly"
-->"you need to get a passport first"

make sure user answers in a yes/no format
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your  (yes/no) ");
        String passport = scanner.nextLine().toLowerCase();
        if(passport.equals("yes")) {
            System.out.println("Please provide your ticket to fly or your jet (ticket/jet)");
            String ticketOrJet = scanner.nextLine();
            if(ticketOrJet.equalsIgnoreCase("ticket")) {

                System.out.println("what is the weight of your luggaga? ");
                int weightOfLuggage = scanner.nextInt();
                if(weightOfLuggage<=40) {
                    System.out.println("you are good to fly");
                } else {
                    System.out.println("your luggage is over the weight limit, please make sure it is under 40 pounds");
                }

            } else if (ticketOrJet.equalsIgnoreCase("jet")) {

                    System.out.println("have a good travel");
                } else {
                System.out.println("you need to buy a ticket first");
            }
                } else {
            System.out.println("you need to get a passport first ");
        }




    }
}
