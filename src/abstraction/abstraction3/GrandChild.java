package abstraction.abstraction3;

public class GrandChild implements Child{

    @Override
    public void run() {
        System.out.println("Grandchild is running");
    }

    @Override
     public void jump() {
        System.out.println("Jumping in Grandchild class");
    }

    @Override
    public void cry() {
        System.out.println("No crying");
    }
}
