package abstraction.abstraction2;

public class Fish implements CanSwim{

    int eye = 2;

    @Override
    public void swim() {
        System.out.println("fish is swimming");
    }

    @Override
    public void dive() {
        System.out.println("fish is diving");
    }
}
