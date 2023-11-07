package abstraction.abstraction2;

public interface CanFly {


    //in interface, if you want to declare variables >> you must initialize the variables
    final int WINGS = 2;
    int TAIL = 1;

    //public abstract void fly();   // Modifier 'abstract' is redundant for interface methods
    void fly();

    void landing();



}
