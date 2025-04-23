package topic6BankAccount;

public class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Внести можно только положительную сумму.");
        } else
            balance += amount;

    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new RuntimeException("Введите полижительную сумму.");
        }

        if (balance >= amount) {
            balance -= amount;
        } else
            System.out.println("Не достаточно средств для снятия.");
    }

    public void getBalance() {
        System.out.println("Ваш аккаунт: " + accountNumber + '\n' + "Ваш баланс: " + balance);
    }
}
