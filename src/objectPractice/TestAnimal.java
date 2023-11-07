package objectPractice;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TestAnimal {
    public static void main(String[] args) {

        Random rd = new Random(); // this is creating the object of the specific class

        Animal cat = new Animal();
        System.out.println(cat.name); // null - default value
        System.out.println(cat.age); //0
        System.out.println(cat.color);//null

        //assign value to my cat object

        cat.name = "Tom";
        System.out.println(cat.name); // Tom

        String nameAsUpperCase = cat.name.toUpperCase();
        System.out.println(nameAsUpperCase);//
        System.out.println(cat.name); //

        cat.age = 3;
        System.out.println(cat.age); //3

        System.out.println("++++++++++++++++++++++");

        // Task: create a new animal, initialize all variables and print them out

        Animal bird = new Animal();

        System.out.println(bird.color);//red
        System.out.println(bird.name);//null

        cat.sleep(); // Animal is sleeping
        bird.sleep(); //Animal is sleeping

        // Tom is sleeping

        //Task: create a method which is called 'eat'
        //this method will send a message like >> "..... is eating"
        // call this eat method with a new animal object

        Animal fish = new Animal();

        fish.sleep();
        fish.eat();

        fish.name = "Dorry";
        fish.eat();

        //yellow fish is eating

        fish.color = "yellow";
        fish.eat();

        //want animal to gain calories as they eat

        System.out.println(cat.calories); //0.0
        System.out.println(fish.calories);
        System.out.println(bird.calories);














    }
}
