package arraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        ask user how many names of students she or he wants to store in the array
        take those names from the user one by one and
        store them into "studentNames" array
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many names do you want to store  ");

        int capacityOfArray = scanner.nextInt();

        String[] studentNames = new String[capacityOfArray];

        String[] longStudentNames = new String[capacityOfArray];




        for (int i = 0; i < capacityOfArray; i++) {
            System.out.println("Enter student name");
            String name = scanner.next();


            //if the student name has 4 or more letters >> store that name into another array

            if (name.length() >= 4) {
                longStudentNames[i] = name;


            } else {
                studentNames[i] = name;


            }
        }
        System.out.println("StudentsNames array has these students:" + Arrays.toString(studentNames));
        System.out.println("LongStudentsNames array has these students:" + Arrays.toString(longStudentNames));

    }
}

