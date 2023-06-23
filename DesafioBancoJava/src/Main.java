import java.util.ArrayList;
import java.util.List;

import account.Account;
import account.ContaCorrente;
import account.ContaPoupanca;
import bank.Bank;
import customer.Customer;
import exception.BankException;

public class Main {
    public static void main(String[] args) throws BankException {

        Customer lucas = new Customer("Lucas");
        ContaCorrente cc = new ContaCorrente(lucas);

        Customer laura = new Customer("Laura");
        ContaPoupanca cp = new ContaPoupanca(laura);

        cc.deposit(100);
        cc.transfer(cp, 50);

        Bank bank = new Bank("Nubank");

        List<Account> accountList = new ArrayList<>();
        accountList.add(cc);
        accountList.add(cp);

        bank.setAccounts(accountList);
        bank.listAccounts();
    }
}