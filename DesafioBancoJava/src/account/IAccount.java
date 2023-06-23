package account;

import bank.IBankingOperations;
import customer.ICustomer;

public interface IAccount extends IBankingOperations, ICustomer {

    int getAgency();

    int getNumber();

    double getBalance();

    void setBalance(double balance);

    void getStatus();
}