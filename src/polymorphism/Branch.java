package polymorphism;

public class Branch extends Bank{

    public void openBranch(){
        System.out.println("Can open a branch from Bank");
    }
    @Override
    public void loan(){
        System.out.println("Branch can give loan up to $5_000_000");
    }
}
