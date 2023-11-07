package inheritance.inheritancePractice3;

import java.util.Random;

public class Rose extends Flower{
    String size;
    String smell;


    public Rose(){                          //we need create a constructor for Rose class, because the parent class
                                           // doesn't have default constructor anymore, only with price

        super(8.9); //=> super() is used to call super class constructor from subclass constructor
    }
    //another second constructor
    public Rose(String size){
        super(7.7);
        this.size = size; //overloaded my constructor => Generate a constructor
    }
      // let's overload our constructor for rose class
    public Rose(String type, String color, String size, String size1, String smell) {
        super(type, color, size); // come from the parent class constructor
        this.size = size1;
        this.smell = smell;
    }

    public static void main(String[] args) {

        Flower flower = new Flower(4.5);
        flower.watering(5);
        System.out.println(flower.price); // 4.5

        Rose rose = new Rose();
        rose.watering(10);
        System.out.println(rose.price); //8.9 --> coming from constructor

        Rose rose2 = new Rose("small");  //check the behavior of second constructor
        System.out.println(rose2.price); //7.7
        System.out.println(rose2.size); //small

        Rose rose3 = new Rose("Rose", "Red", "SMALL", "Medium", "Good");
        System.out.println(rose3.price); //0.0
        rose3.price = 1.0;
        System.out.println(rose3.price); //1.0
        System.out.println(rose3.size); //Medium
        System.out.println(rose3.smell); //Good

    }

}
