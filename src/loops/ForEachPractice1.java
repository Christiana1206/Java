package loops;

public class ForEachPractice1 {
    public static void main(String[] args) {

        int[] zipcode = {222, 333, 55, 777, 999};

        //print out every single zipcode one at a time

        for(int number :  zipcode) {
            System.out.println(number);
        }
        // i want to print out only 777

        System.out.println(zipcode[3]);



    }
}
