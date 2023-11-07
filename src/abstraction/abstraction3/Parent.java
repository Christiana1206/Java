package abstraction.abstraction3;

public interface Parent {


    void run();

    //default method
    default void jump(){   // -> allow interfaces to have method with a body
        System.out.println("Jumping in parent interface");
    }

    //protected void crying();

    void cry();


    //internal class usage -> helper method
    private void stayHome(){ // private method is Ok because it's for internal usage
        System.out.println("I stay home");
    }
}
