package abstraction.abstraction2;

public class Duck extends Animal implements CanFly, CanSwim{


    @Override
    public void fly() {
        System.out.println("Dug is flying");
    }

    @Override
    public void landing() {
        System.out.println("Dug is landing");
    }

    @Override
    public void swim() {
        System.out.println("Dug is swimming");
    }

    @Override
    public void dive() {
        System.out.println("Dug is diving");
    }
}
