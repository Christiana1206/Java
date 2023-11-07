package objectPractice;

import java.util.Random;

public class Student {

    String name;
    String address;
    int age;

    /*
    Task1
    - create method is named 'study'
    it will return the hours of studying a student did, and print "Studying"

    -create a constructor to initialize name of student
    -and print out any message "Constructor with name"

    -create another class to test your code
     */

    public int study() {
        int hours = numberCreator();
        System.out.println("Studying for " + hours);
        return hours;
    }


    public int sleep() {
        System.out.println("Sleeping for " + numberCreator());
        return numberCreator();
    }

    //create one method that will return us a random number between 0-24

    public int numberCreator() {
        Random random = new Random();
        int number = random.nextInt(25);
        return number;
    }


    public Student(String name) {
        this("909 west street", 26); // it has to be first we should do, when we call a constructor within another constructor
        this.name = name;//we initialize name of student, this name = "Sara"
        System.out.println(" First Constructor (with name)");

    }

    //create one constructor to initialize the other 2 instance variables(overload constructor)
    public Student(String address, int age) {
        this.address = address;
        this.age = age;
        System.out.println("Second constructor");
    }

    //create one constructor to initialize all the instance variables(overload constructor)
    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.studentInfo();
    }

    public void studentInfo() {

        System.out.println("Student name: " + name + "\nAddress: " + address + "\nAge: " + age);
    }

    public String toString() {
        return name + " - " + address + " - " + age;
    }

    // public String toString(){
    // return "*****THIS METHOD IS ATTACHED TO EVERY OBJECT*****";
    // toString Method IS A SPECIAL METHOD AND IT WILL STICK TO EVERY OBJECT YOU CREATE FROM THAT CLASS
    //THE BENEFIT OF OVERWRITING METHOD is will print whatever I return


}













