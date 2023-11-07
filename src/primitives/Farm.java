package primitives;

public class Farm {


    public static void main(String[] args) {

        /*
1- calculate numbers of legs in a farm if
there are 12 cows and 25 chickens at this farm
- create variables to represent data and find the total numbers of the legs in this farm
"The total numbers of legs in the farm are:"......
 */

        int cows = 12;
        int chickens = 25;
        int numOfCowLegs = 4;
        int numOfChickenLegs = 2;

        int total = (cows*numOfCowLegs + chickens*numOfChickenLegs);


        System.out.println("The total numbers of legs in this farm are " + total);

        /*find the worth of the farm if:
each cow is $1500
each chicken is $30
-show total worth of the farm as "The worth of the farm is:"....
 */


        double cowsPrice = 1500;
        double chickensPrice = 30;

        double totalPrice = (cows*cowsPrice + chickens*chickensPrice);

        System.out.println("The worth of the farm is " + totalPrice);

    }
}


