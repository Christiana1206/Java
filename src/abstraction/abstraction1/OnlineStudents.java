package abstraction.abstraction1;

public class OnlineStudents extends Student{
    public OnlineStudents(String name, int age){
        super(name, age);
    }

    @Override
    public void attend(){
        System.out.println("Online students are attending the class via Zoom");
    }

    @Override
    public int eat() {
        System.out.println("Online students are eating at home");
        return 0;
    }

    // online students can have its own functionality
    public void havePJ(){
        System.out.println("Online students are wearing PJs during class");
    }

}




