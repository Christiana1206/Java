package mapPractice;

import java.util.Random;

public class Employee {

    /*
    ====TASK:===========
-create an employee class with instance variables of name, city, age, id
-create one constructor to initialize instance variables
-create a method to generate random employee id(limit 1000000) and use this id for employee
-create employeeTest class
-create 4 employee object and store them in a MAP
-while storing employees in the map, use their ids as key for the map
-create a method to print only employee names from map
 *
     */

    String name, city;
    int age, id;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = idGenerator();
    }

    public static int idGenerator() {
        Random randomId = new Random();
        return randomId.nextInt(1_000_000);

    }



    }

