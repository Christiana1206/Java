package abstraction.abstraction2;

public class Puffin extends CanRun implements CanFly, CanSwim {

    @Override
    public void fly() {
        System.out.println("Puffin is flying");
    }

    @Override
    public void landing() {
        System.out.println("Puffin is landing");
    }

    @Override
    public void run() {
        System.out.println("Puffin is running");

    }

    @Override
    public void swim() {
        System.out.println("Puffin is swimming");

    }

    @Override
    public void dive() {
        System.out.println("Puffin is diving");

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Puffin is eating");
    }
}
