package accessModifiers;

public class ChildAnimal extends Animal{
    public static void main(String[] args) {

        ChildAnimal childAnimal = new ChildAnimal();
        childAnimal.name = "Bow";
        childAnimal.color = "purple";
        childAnimal.age = 3;

        Animal animal = new Animal();
        animal.name = "Name";
        animal.color = "brown";
        animal.age = 12;


    }



}
