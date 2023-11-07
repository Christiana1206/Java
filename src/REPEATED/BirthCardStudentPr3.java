package REPEATED;


import java.util.Arrays;

public class BirthCardStudentPr3 {

    /*
    create a method that will take name of students
    it will create "Happy Birthday..." birthday card messages for each of the students
    it will return all messages in another array
     */

    public String[] birthCardCreator(String[] names) {

        String[] allMessage = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            String message = "Happy birthday " + names[i];
            allMessage[i] = message;

        }
        return allMessage;
    }

    public static void main(String[] args) {

        BirthCardStudentPr3 student = new BirthCardStudentPr3();
        String[] b18 = {"Sara", "Vera", "Tina"};

        String[] resultWithMessage = student.birthCardCreator(b18);

        System.out.println(Arrays.toString(resultWithMessage));


    }


    }




