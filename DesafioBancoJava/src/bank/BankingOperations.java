package bank;

import account.Account;
import exception.BankException;

public class BankingOperations implements IBankingOperations {

    private Account account;

    public BankingOperations(Account account) {
        this.account = account;
    }

    @Override
    public double withdraw(double amount) throws BankException {

        if (this.account.getBalance() < amount) {
            throw new BankException("INSUFFICIENT FUNDS !");
        }

        double oldBalance = this.account.getBalance();
        double newBalance = oldBalance - amount;
        this.account.setBalance(newBalance);
        return amount;
    }

    @Override
    public void deposit(double amount) {

        double oldBalance = this.account.getBalance();
        double newBalance = oldBalance + amount;
        this.account.setBalance(newBalance);
    }

    @Override
    public void transfer(Account destinationAccount, double amount) throws BankException {
        this.withdraw(amount);

        double oldBalance = destinationAccount.getBalance();
        double newBalance = oldBalance + amount;
        destinationAccount.setBalance(newBalance);
    }
}
