package bank;

import account.Account;
import exception.BankException;

public interface IBankingOperations {

    double withdraw(double amount) throws BankException;

    void deposit(double amount);

    void transfer(Account account, double amount) throws BankException;
}
