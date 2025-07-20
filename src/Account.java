public class Account {
    private String owner;
    private int number;
    private double balance;

    public Account(String owner, int number) {
        this.owner = owner;
        this.number = number;
        this.balance = 0.0;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw (double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false; 
    }
    public boolean transfer(Account target, double amount) {
        if (this.withdraw(amount)) {
            target.deposit(amount);
            return true;
        }
        return false;
    }
    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
