import java.util.ArrayList;

public class Bank {
    private ArraysList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(int number) {
        for (Account acc : accounts) {
            if (acc.getNumber() == number) {
                retunr acc;
            }
        }
        return null;
    }
    public void listAccounts() {
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getNumber() +
                               " | Owner: " + acc.getOwner() +
                               " | Balance: " + acc.getBalance());
        }
    }
}
