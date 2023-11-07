package abstraction.abstraction2;

public class Bird extends CanRun implements CanFly{

    //in the past used 'extends' keyword to create relationship between 2 classes
    //then creating relationship between an interface and a class we use 'implements' keyword


    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void landing() {
        System.out.println("Bird is landing");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }
}
