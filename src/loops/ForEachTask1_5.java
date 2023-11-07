package loops;

import java.util.Arrays;

public class ForEachTask1_5 {
    public static void main(String[] args) {

        /*
        if the name of the student starts with letter 'j' create an email for that student with "@yahoo.com" extension
         */

        String[] studentNames = {"Alex", "David", "Sam", "Jenny", "John", "Sara", "Diana", "Aida" };

        String[] emailList = new String[studentNames.length];

        String emailAddress = "";

        int i = 0;

        for (String student : studentNames) {

            if (student.charAt(0) == 'j' || student.charAt(0) == 'J') {

                 emailAddress = student.toLowerCase().concat("@yahoo.com");
            } else {
                 emailAddress = student.toLowerCase().concat("@gmail.com");
            }
                emailList[i] = emailAddress;
                i++;
        } // listen again 2.55 day 20 18.09
        System.out.println(Arrays.toString(emailList));

    }
}
