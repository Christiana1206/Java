package projectDayElmar;

public class Overloading {

    //name should be same
    //amount of parameters ir data type of parameters should be changed
    //Return type doesn't impact

    public static int sum(int ... nums) {
        int sum = 0;
        for(int num : nums) {
            sum+=num;
            // Static Polymorphism (Compile time)
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 6, 9, 13));

        System.out.println(Overloading.sum(3, 6, 8, 8)); // for automation
    }
}
