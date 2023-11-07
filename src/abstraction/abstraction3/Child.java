package abstraction.abstraction3;

public interface Child extends Parent{

    void run();

    default void jump(){
        System.out.println("Jumping in child interface");
    }

    @Override
    void cry();
}
