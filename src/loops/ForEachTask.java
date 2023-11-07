package loops;

import java.util.Arrays;

public class ForEachTask{
    public static void main(String[] args) {
        /*
        generate e-mail address for each student as following
        and store these emails to another array for future usage
        ex: alex@gmail.com
         */

        String[] studentNames = {"Alex", "David", "Sam", "Jenny", "Sara", "Diana", "Aida"};

        String[] emailList = new String[studentNames.length];

        int i = 0;

        for(String student : studentNames){

            String emailAddress = student.toLowerCase().concat("@gmail.com");

            emailList[i] = emailAddress;
            i++;

        }
        System.out.println(Arrays.toString(emailList));

        for(String cell : emailList){
            System.out.println(cell);
        }

    }
}
