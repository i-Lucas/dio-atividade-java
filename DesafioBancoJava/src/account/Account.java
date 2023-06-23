package account;

import customer.Customer;
import bank.BankingOperations;
import exception.BankException;

public abstract class Account implements IAccount {

    protected Customer customer;
    protected double balance = 0;
    protected BankingOperations operation;

    private static int AGENCY_DEFAULT = 4455;
    private static int SEQUENTIAL_NUMBER = 1000;

    public Account(Customer customer) {

        Account.SEQUENTIAL_NUMBER++;
        this.customer = customer;
        this.operation = new BankingOperations(this);
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public int getAgency() {
        return Account.AGENCY_DEFAULT;
    }

    @Override
    public int getNumber() {
        return Account.SEQUENTIAL_NUMBER;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double withdraw(double amount) throws BankException {
        return operation.withdraw(amount);
    }

    @Override
    public void deposit(double amount) {
        operation.deposit(amount);
    }

    @Override
    public void transfer(Account destinationAccount, double amount) throws BankException {
        operation.transfer(destinationAccount, amount);
    }

    @Override
    public void getStatus() {
        System.out.println("TITULAR: " + this.customer.getCustomerName());
        System.out.println("AGENCIA: " + this.getAgency());
        System.out.println("NÚMERO DA CONTA: " + this.getNumber());
        System.out.println("SALDO: " + this.getBalance() + "\n");
    }
}
