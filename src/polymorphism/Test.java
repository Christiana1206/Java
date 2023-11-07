package polymorphism;

public class Test {
    public static void main(String[] args) {

        Atm atm = new Atm();
        atm.deposit(100);
        atm.checkBalance();
        atm.withdraw(50);
        atm.checkBalance(2023);

        Bank bank = new Bank();
        bank.openAccount();
        bank.loan();

        Branch branch = new Branch();
        branch.openBranch();
        branch.loan(); //dynamic polymorphism, only when run I can see
    }

}