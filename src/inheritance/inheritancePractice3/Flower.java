package inheritance.inheritancePractice3;

public class Flower {

    String type, color, size;

    double price;

    public void watering(int times){
        System.out.println("Flower getting watered for "+ times+" times");
    }
         // create no parameter constructor:
         // public Flower(){
         // System.out.println("No param Constructor");
         // }

    public Flower(double price){       //same name as a class name!!
        this.price = price;
        System.out.println("Constructor with Price param");
    }
        // I want to create one more constructor => Generate type, color and size
    public Flower(String type, String color, String size) {
        this.type = type;
        this.color = color;
        this.size = size;
        System.out.println("Three argument constructor");
    }
}
