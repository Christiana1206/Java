package polymorphism;

public class Atm {

    public void deposit(int depositAmount){
        System.out.println("You have deposited $"+depositAmount);
    }
    public void withdraw(int withdrawAmount){
        System.out.println("You are withdrawing $"+withdrawAmount);
    }
    public void checkBalance(){
        System.out.println("You are checking your balance");
    }

    public void checkBalance(int year){
        System.out.println("You are checking your balance for year "+year);
    }
}
