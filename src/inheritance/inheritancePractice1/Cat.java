package inheritance.inheritancePractice1;

public class Cat extends DomesticAnimal {


    @Override // just a label but I can see that it's overridden
    public void hunt() {
        System.out.println("Cat is hunting");
    }

    @Override
    public void eat() {

        System.out.println("Cat is eating its own hunt");
    }
}
