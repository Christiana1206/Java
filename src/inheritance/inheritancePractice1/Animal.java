package inheritance.inheritancePractice1;

public class Animal {


    String name = "Animal*";
    int age;
    String color;

    {age = 12;}

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void eat(){
        System.out.println(name+" is eating");
    }



}
