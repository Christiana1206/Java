package objectPractice;

import java.util.Random;

public class TestStudent {
    public static void main(String[] args) {

        Student student1 = new Student("Sara");
        System.out.println(student1.name);


        //CONSTRUCTOR will be triggered as soon as object is created
        //Method will trigger when you call it


        student1.study();
        int studyHour = student1.study();
        System.out.println(studyHour);



        System.out.println("======================");

        Student student2 = new Student("123 E Seeger Rd", 34);
        System.out.println(student2.age);
        System.out.println(student2.address);
        System.out.println(student2.name);

        System.out.println(student1.age); //0

        Student student3 = new Student("Bob", "553 E Seeger Rd", 45);

        System.out.println("**********************");

        student1.studentInfo(); //Sara name, everything else is null

        System.out.println("**********************");

        student2.studentInfo();

        System.out.println("**********************");

        student3.studentInfo();


        System.out.println("++++====++++====");
        System.out.println(student3); //Bob - 553 E Seeger Rd - 45 --> toString Method

        System.out.println("----------------");
       // student3.sleep(5);
        //student3.study(4);

        System.out.println(student3.numberCreator());

        System.out.println("******************");

        student3.study();


        System.out.println("******************");

        student3.sleep();


        Student student = new Student("Tina", "B18", 26); // create object from a student class













    }






    }


