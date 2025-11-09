import java.util.*;

class BankAccount {
    private double balance;
    private static int totalAccounts = 0;
    private final int accountNumber;

    public BankAccount() {
        this.balance = 0;
        this.accountNumber = totalAccounts + 1;  // Unique account number
        totalAccounts++;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws IllegalArgumentException, InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance - amount < 0) {
            throw new InsufficientFundsException("Insufficient funds for this withdrawal.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: $" + balance;
    }

    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show balance");
            System.out.println("5. Show all accounts");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BankAccount newAccount = new BankAccount();
                    accounts.add(newAccount);
                    System.out.println("New account created! " + newAccount);
                    break;

                case 2:
                    System.out.print("Enter account number (1 to " + accounts.size() + "): ");
                    int depositAccountIndex = scanner.nextInt() - 1;
                    if (depositAccountIndex < 0 || depositAccountIndex >= accounts.size()) {
                        System.out.println("Invalid account number.");
                        break;
                    }
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    try {
                        accounts.get(depositAccountIndex).deposit(depositAmount);
                        System.out.println("Deposit successful.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter account number (1 to " + accounts.size() + "): ");
                    int withdrawAccountIndex = scanner.nextInt() - 1;
                    if (withdrawAccountIndex < 0 || withdrawAccountIndex >= accounts.size()) {
                        System.out.println("Invalid account number.");
                        break;
                    }
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        accounts.get(withdrawAccountIndex).withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful.");
                    } catch (BankAccount.InsufficientFundsException | IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter account number (1 to " + accounts.size() + "): ");
                    int balanceAccountIndex = scanner.nextInt() - 1;
                    if (balanceAccountIndex < 0 || balanceAccountIndex >= accounts.size()) {
                        System.out.println("Invalid account number.");
                        break;
                    }
                    System.out.println("Balance: $" + accounts.get(balanceAccountIndex).getBalance());
                    break;

                case 5:
                    System.out.println("\nAll Accounts:");
                    for (BankAccount account : accounts) {
                        System.out.println(account);
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

