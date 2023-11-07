package inheritance.inheritancePractice1;

public class Zoo {
    public static void main(String[] args) {

        // This is my test class

        Animal animal = new Animal();
        System.out.println(animal.name); //null

        WildAnimal wildAnimal = new WildAnimal();
        System.out.println(wildAnimal.name); //null
        wildAnimal.name = "Mufasa"; // => need to comment out name in WildAnimal class and give a value to my object here

        Lion lion = new Lion();
        System.out.println(lion.name); //null
        lion.name = "Simba";
        System.out.println(lion.name);// Simba

        // If a class do not have its own instance variables it will try to put it from the closest parent,
        // but once it has that instance variable in its own class it will put that field from their own class

       // System.out.println(Animal.age); -> Now even for same Animal class I can't reach out to private field

        animal.eat(); //Animal*Animal is eating => all call parent's method
        wildAnimal.eat();//Animal*Animal is eating
        lion.eat();//Animal*Animal is eating

        //methods are always coming from Parent Animal class

        DomesticAnimal domestic = new DomesticAnimal();
        domestic.sleep();

        System.out.println("---------------------------");

        domestic.hunt();

        Cat cat = new Cat();
        cat.hunt();
        // unless cat overrides the hunt methods, it will take it from their parent: Domestic animal is hunting

        cat.eat();

        domestic.relax();
        Dog dog = new Dog();
        dog.relax();

        //domestic.takingNap();


        WildAnimal w = domestic.takingNap(); //when I want to store this, I can do this only in return type
        Lion littleLion = dog.takingNap(); //Dog is taking a nap
        System.out.println(littleLion);






    }
}
