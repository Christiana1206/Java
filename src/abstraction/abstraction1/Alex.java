package abstraction.abstraction1;

public class Alex extends OnCampusStudents{
    public Alex(String name, int age){
        super(name, age);

    }
    //All abstract methods were in the grandparent of alex so now since the parents decided how to attend and eat,
    // now alex doesn't have to worry about it => don't need to implement abstract methods (but can override)

    //I can still override my method
    public void attend(){
        System.out.println("alex is attending in hybrid mode");
    }

    public void tableTennis(){
        System.out.println("playing table tennis");
    }
}
