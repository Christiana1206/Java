package polymorphism;

public class Bank extends Atm{

    public void openAccount(){
        System.out.println("New account created at the Bank");
    }

    public void loan(){
        System.out.println("bank can give loan up to $1_000_000");
    }
}
