public class BankAccount {
    private double balance;// Private variable to hide internal state
    // Public method to access the balance
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
        }
    }
    //Public method to withdraw money safely
    public void withdraw(double amount) {
        if (amount>0 && amount <= balance){
            balance -=amount;
        }
    }
}
