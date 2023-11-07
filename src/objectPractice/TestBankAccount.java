package objectPractice;

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount account= new BankAccount();
        account.deposit(100);
        account.withdraw(60);

       // account.displayInfo();


        account.userName = "JAVA";
        account.password = "11234";
        account.logIn("JAVA", "11234");

        account.displayInfo();

        account.accountHolderName = "Sara";
        account.bankName = "BOA";
        account.displayInfo();
    }


}
