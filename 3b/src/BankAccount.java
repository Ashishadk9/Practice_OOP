public class BankAccount {
    private double balance;
    // Getter method

    public double getBalance() {
        return balance;
    }
    // Setter method for deposit
    public void deposit(double amount) {
      if (amount>0){
          balance += amount;
      }
    }
    // setter method for withdraw
    public void withdraw(double amount){
       if (amount > 0 && amount <= balance){
           balance -=amount;
       }
    }
}
