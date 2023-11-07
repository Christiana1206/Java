package objectPractice;

public class VarArgs1 {
    /*
    create a method that will find the sum of parameters from an array
     */

    public static void sumOfArray(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum+=numbers[i];

        }
        System.out.println("Sum from the sum method is "+sum);

    }

    //Variable Arguments: another way to pass multiple parameters
    public static void sumOfArray2(int ... num) { //(int ... num)--> this is called variable arguments

        int sum = 0;

        for (int n : num) {

            sum += n;
        }

        System.out.println("Sum from the sum2 method is " + sum);

    }

    /*
    create a method that will take var args
    this method will print out something like:
    1.saturday
    2.sunday
    3. ...
     */

    public static void dayList(String ... day) {

        for (int i = 0; i < day.length; i++) { //  for (int i = 0, c = 1; i < day.length; i++, c++)

            System.out.println(i+1+". "+day[i]);// System.out.println(c+". "+day[i]);
        }
    }

    public static void main(String[] args){


         dayList("Saturday", "Sunday", "Monday", "Tuesday");


     // public static void main(String[] args){

        int[] nums = {1, 2, 3, 4};
        VarArgs1.sumOfArray(nums);
        sumOfArray(nums);

        sumOfArray2();//0
        sumOfArray2(5,5); //10
        sumOfArray2(1,2,3,4,5,6,7,8);//36
        sumOfArray2(nums);//10

        }


    }

/*
public static void main(String[] args){

    int[] nums = {1, 2, 3, 4};
    VarArgs1.sumOfArray(nums); //if I create a new class, i can use this without
    // creating an object (call class name, method name , pass the parameters
    //it's perfect for other classes
    sumOfArray(nums); // --> only in the same class, because in this class we have the num and method,
    // we don't have to even provide a name of the class, because we

}
*/
