package loops;

public class NestedLoop2 {
    public static void main(String[] args) {
        /*
        print out minutes and hours
        hour from 1 to 6
        minute from 0 to 59
        1 hour : 1 minutes : 1 second
         */


        for (int h = 1; h <= 6; h++) {


            for (int m = 0; m <= 59; m++) {


                for (int s = 0; s <= 59; s++) {
                    System.out.println(h + " hour " + m + " minutes " + s + " second");

                }
            }
        }
    }
}


