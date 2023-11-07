package arraysPractice;

import java.util.Arrays;

public class MultiPractice2 {
    public static void main(String[] args) {

        String[][] usStates = {{"NY", "DE", "NJ" }, {"IL", "WI", "IN" }, {"CA", "OR", "WA" }};

        //what is the capacity of larger array
       // System.out.println(usStates.length); //3

        //what is capacity of east coast region
/*
        for (int i = 0; i < usStates.length; i++) {
            for (int s = 0; s < usStates[i].length; s++) {
                System.out.println(usStates[i][s]);

                if (usStates[i][s].equalsIgnoreCase("WI")) {
                    System.out.println("Wisconsin's capital city is Madison");
                    System.out.println("index of WI is " + i + "-" + s);
                } else {
                    System.out.println(usStates[i][s]);
                }
            }
 */
/*
        for(String[] states : usStates){
            for(String oneState : states) {
                System.out.println(oneState);
            }


 */


            //System.out.println(usStates[0].length); //3

            // System.out.println(Arrays.deepToString(usStates));


            // TASK: i want to visit every single state one at a time
            //task: When you find a US state named "WI", print out >> "Wisconsin's capital city is Madison"
            //task: When you find a US state named "WI", print out "Wisconsin's index is ...index.."

        for (int i = 0; i < usStates.length; i++) {

            for (int j = 0; j < usStates[i].length; j++) {
                System.out.println(usStates[i][j]);

/*
                if (usStates[i][j].equalsIgnoreCase("WI")) {
                    System.out.println("Wisconsin's capital city is Madison");
                    System.out.println("Wisconsin's index is " + i + "-" + j);

                } else {
                    System.out.println(usStates[i][j]);



                }

 */
            }

        }


        /*
        System.out.println("======FOR-EACH LOOP====I want to print out each state one at a time=====");

        for (String[] regions : usStates) {
            for (String oneState : regions) {
                System.out.println(oneState);
            }



         */

        }
    }



