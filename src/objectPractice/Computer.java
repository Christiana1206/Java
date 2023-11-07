package objectPractice;

import java.sql.SQLOutput;

public class Computer { // Java already created the class for us , so we give the same name to the Constructor


    String brand;
    double price;
    String color;

    public Computer(){
        // initialize instance variable or do something related to the object
        System.out.println("This is No argument Constructor"); //argument is the same as parameter, exec telly inside the parentheses
    }
    public void playGame(){
        System.out.println("Gaming");
    }
    public void playGame(int hour){
        System.out.println("Gaming2 "+hour);
    }

    //overloading a constructor:
    public Computer(String brand) {
        this.brand = brand;
        //'this keyword -> use to refer to the current class variables and methods
        //I use 'this keyword, so it doesn't get confused about which (brand) I am calling(local vs instance)
        System.out.println("one argument Constructor");
    }


    }


