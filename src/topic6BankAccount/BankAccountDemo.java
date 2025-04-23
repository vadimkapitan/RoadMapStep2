package topic6BankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("13", 500);


        acc1.deposit(300);
        acc1.getBalance();

        acc1.withdraw(718);
        acc1.getBalance();

        acc1.withdraw(-1);
        acc1.getBalance();


    }
}
