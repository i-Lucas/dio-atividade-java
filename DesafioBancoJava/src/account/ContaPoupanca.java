package account;

import customer.Customer;

public class ContaPoupanca extends Account {

    public ContaPoupanca(Customer customer) {
        super(customer);
    }

    @Override
    public String getCustomerName() {
        return super.getCustomer().getCustomerName();
    }

    @Override
    public void getStatus() {
        System.out.println("\nCONTA POUPANCA");
        super.getStatus();
    }

}