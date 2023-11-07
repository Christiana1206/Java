package primitives;

public class Task1 {
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


        // how many payments will be?

        System.out.println(salePrice/mounthPayment);





    }

}
