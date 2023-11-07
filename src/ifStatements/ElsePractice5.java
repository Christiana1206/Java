package ifStatements;
import java.util.Scanner;
public class ElsePractice5 {
    public static void main(String[] args) {
        /*
when your total purchase amount is $1000 or more you get 20% discount
- if the total purchase amount is less than $1000, you get only 5% discount

- find out discount amounts and SHOW to user
- find the final payment

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how much money you spent");
        double purchase = scanner.nextDouble();

        if (purchase >= 1000) {
            System.out.println("your discaunt is 20% : " + purchase*0.2 + '$' + " and your total paynent is : " + (purchase - (purchase*0.2)));
        } else {
            System.out.println("your discaunt is 5% : " + purchase*0.05 + '$' + " and your total payment is : " + (purchase - (purchase*0.05)));
        }
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how much you spent in total before discount");
        double spending = scanner.nextDouble();

        if(spending>=1000){
            double discount20 = spending* 0.20;
            double paymentAfter20 = spending - discount20;

            System.out.println("your 20% discount is $: "+discount20);
            System.out.println("your final payment after 20% discount is $: "+paymentAfter20);
        }else{
            double discount5 = spending* 0.05;
            double paymentAfter5 = spending - discount5;

            System.out.println("your 5% discount is $: "+discount5);
            System.out.println("your final payment after 5% discount is $: "+paymentAfter5);
        }
        System.out.println("Thank you for shopping");

    }
}
