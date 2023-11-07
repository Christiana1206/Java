package scannerPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        String name = "David";
        System.out.println(name);//David

        //I want to store the lastName and I want to take the value of the last name from user
        // then want to attach the last name to the name and say "You full name is "+...

//        String lastName = "White";
//        System.out.println("Your full name is "+name+" "+lastName);

        //SCANNER is a class, we have to import it to bring it into our class

        Scanner input = new Scanner(System.in);
        System.out.println("What is your last name?");
        String lastName = input.nextLine();//hey scanner, I need you to read the nextLine
        System.out.println(lastName);
        System.out.println("Your full name is " + name + " " + lastName);


        System.out.println("==============TASK===============");

        //ask user to provide their city
        //..(name) you are living in..(city)...

        System.out.println("What is your city?");
        String yourCity = input.nextLine();
        System.out.println(name + " you are living in " + yourCity);


    }

    }
