package abstraction.abstraction1;

public class OnCampusStudents extends Student {


    public OnCampusStudents(String name, int age) {
        super(name, age);
    }

    @Override
    public void attend() {

        System.out.println("On Campus students are attending in-person from the school");
    }

    @Override
    public int eat() {
        System.out.println("On Campus students eat snacks");
        return 0;
    }
}
    //override: change implementation
    //implements: implement the attend method which had no implementation before

    //public abstract void run(); -> OnCampus class is a non-abstract class
    //So, I cannot have any abstract methods





