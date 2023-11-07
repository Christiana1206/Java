package scannerPractice;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
    // take the name of their school and batch number from user
    // concatenate the school name with the batch number
    // "you should be in .... (school+batch)...right now"

    Scanner dataTaker = new Scanner(System.in);
        System.out.println("What is the name of your school?");
    String schoolName = dataTaker.nextLine();
        System.out.println("What is your batch number?");
    String batchNumber = dataTaker.nextLine();
        System.out.println("you should be in " +schoolName+batchNumber);

    // take the batch number in an integer format

        System.out.println("What is your batch number again?");
    int batchNumber2 = dataTaker.nextInt();
        System.out.println(batchNumber2*2);

    //take the age of the user and tell him//her that she/he will be... (age) ... in 10 years.
    //you will be .... in 10 years

        System.out.println("What is your age?");
    int age = dataTaker.nextInt();
        System.out.println("you will be " +(age+10)+ " years old in 10 years");





}



        }
