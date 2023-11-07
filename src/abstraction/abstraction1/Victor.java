package abstraction.abstraction1;

public class Victor extends OutOfStateStudents{
    public Victor(String name, int age){
        super(name, age);
    }

    @Override
    public void callOffice() {
        System.out.println("Victor is calling the office");
    }


}
