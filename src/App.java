import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int option;

        do {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. List Accounts");
            System.out.println("0. Exit");
            System.out.println("Choose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Owner name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Account number: ");
                    int accNum = sc.nextInt();
                    bank.addAccount(new Account(name, accNum));
                    break;

                case 2:
                    System.out.println("Account number:");
                    int depNum = sc.nextInt();
                    Account depAcc = bank.findAccount(depNum);
                    if (depAcc != null) {
                        System.out.println("Amount: ");
                        double amount = sc.nextDouble();
                        depAcc.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.println("Account number: ");
                    int withnum = sc.nextInt();
                    Account withAcc = bank.findAccount(withNum);
                    if (withAcc != null) {
                        System.out.println("Amount:");
                        double amount = sc.nextDouble();
                        if (!withAcc.withdraw(amount)) {
                            System.out.println("Insufficient balance.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.println("Source account ");
                    int from = sc.nextInt();
                    Acoount fromAcc = bank.findAccount(from);

                    System.out.println("Target account: ");
                    int to = sc.nextInt();
                    Account toAcc = bank.findAccount(to);
                    
                    if (fromAcc != null && toAcc != null) {
                        System.out.println("Amount:");
                        double amount = sc.nextDouble();
                        if (!fromAcc.transfer(toAcc, amount)) {
                            System.out.println("Transfer failed. ");
                        }
                    } else {
                        System.out.println("One or both accounts not found.");
                    }
                    break;
                case 5:
                    bank.listAccounts();
                    break;
            }
        }while (option != 0);

        sc.close();
        System.out.println("System closed.");
            }
        }

