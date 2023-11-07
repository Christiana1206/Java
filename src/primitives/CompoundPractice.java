package primitives;

public class CompoundPractice {
    public static void main(String[] args) {






        /*
TASK:
Create a new Java class called 'Task1' and solve following question;
A phone is currently on sale for $875 and you can make monthly payment of $100
if you take this deal. What will be the last month's payment?
 – Solve it by applying modulus operator
 */
        double salePrice = 875;
        double mounthPayment = 100;
        double lastPayment = salePrice % mounthPayment;
        System.out.println(lastPayment);






        /*
     TASK:
Solve following question;
A phone is available for credit  for $1025 and you can make monthly payment of $25
if you take this deal. What will be the last month's payment? and how many years the deel will take.
 – Solve it by applying modulus operator
 */

double creditPrice = 1025;
double everyMonthPay = 50;
double lastOnePay = 1025 % 50;

double months = creditPrice / everyMonthPay;
double yearsOfDeel = months/12;
double restOfMonths = months%12;
System.out.println("The last payment will be " + lastOnePay + " and credit deel will take " + (Math.floor(yearsOfDeel)) + " years " + " and " + restOfMonths + " months ");


    }
}
