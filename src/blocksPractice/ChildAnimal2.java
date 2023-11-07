package blocksPractice;

import accessModifiers.Animal;
import accessModifiers.ChildAnimal;

public class ChildAnimal2 extends Animal{ // using extends keyword I made ChildAnimal2 a subclass of Animal class

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.name = "Child2";

        ChildAnimal2 childAnimal2 = new ChildAnimal2();
        childAnimal2.color = "red";
        childAnimal2.name = "Yuki";

        childAnimal2.runPublic();

        childAnimal2.runProtected(); // -> different package Animal subclass

      //  childAnimal2.runDefault(); // -> cannot reach out to default/private method




    }
}
