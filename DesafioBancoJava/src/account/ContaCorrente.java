package account;

import customer.Customer;
import exception.BankException;

public class ContaCorrente extends Account {

    public ContaCorrente(Customer customer) {
        super(customer);
    }

    @Override
    public void transfer(Account destinationAccount, double amount) throws BankException {
        double transferRate = 5.45;
        this.withdraw(transferRate);
        super.operation.transfer(destinationAccount, amount);
    }

    @Override
    public String getCustomerName() {
        return super.getCustomer().getCustomerName();
    }

    @Override
    public void getStatus() {
        System.out.println("\nCONTA CORRENTE");
        super.getStatus();
    }
}