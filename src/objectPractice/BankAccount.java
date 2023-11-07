package objectPractice;

public class BankAccount {
    /*
    variables:
    accountHolderName, bankName, balance, userName, password, isLoggedIn
    Methods:
    -void displayInfo() -> will print out all account information
    -double deposit() -> one parameter to update balance
    -double withdraw() -> one parameter to update balance
    -void logIn() -> userName, password parameters to update isLoggedIn boolean.
    -signUp() -> parameters will be initialized >> accountHolderName, accountNumber, balance
     */











    String accountHolderName, bankName, userName, password;
    double balance;
    boolean isLoggedIn;


    public void displayInfo() {
        if (isLoggedIn) {
            System.out.println("Account holder's name: " + accountHolderName + " \nBank Name: " + bankName + " \nUser Name: " + userName +
                    " \nPassword: " + password + " \nLogged in: " + isLoggedIn);
        } else {
            System.out.println("Please login first");
        }
    }

    public double deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Your new balance after depositing $" + depositAmount + " is: $" + balance);
        return balance;
    }

    public double withdraw(double withdrawalAmount) {
        balance -= withdrawalAmount;
        System.out.println("Your new balance after withdrawing $" + withdrawalAmount + " is: $" + balance);
        return balance;

    }
        public void logIn (String user, String pass) {
            if (user.equals(userName)&&pass.equals(password)){
                System.out.println("You have successfully logged in");
                isLoggedIn = true;
            }else{
                System.out.println("Check your credentials");
            }

        }
    }

