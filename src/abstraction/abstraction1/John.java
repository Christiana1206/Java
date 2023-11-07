package abstraction.abstraction1;

public class John extends SelfLearnerStudents {
    public John(String name, int age) {
        super(name, age);
    }

    @Override
    public void read() {
        System.out.println("John is reading a book");
    }

    @Override
    public int eat() {
        System.out.println("John is eating at the restorant");
        return 0;
    }

    // don't need to implement method attend, it's inherited from parent SelfLearnerStudent


    public void hike(){
        System.out.println("John is hiking");

    }
}


