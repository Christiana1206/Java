package accessModifiers;

public class Test1 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Sharik";
        animal.color = "Pink";
        animal.age = 23;
        //gender is a private one< so I can't reach out to this field from any other class


        animal.runPublic();  // only 3 of 4 methods, because it is same package, but different classes
        animal.runProtected();
        animal.runDefault();
        //animal.runPrivate(); -> private method





    }
}
