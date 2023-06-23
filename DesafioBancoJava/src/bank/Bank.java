package bank;

import java.util.ArrayList;
import java.util.List;
import account.Account;

public class Bank {

	private String name;
	private List<Account> accounts = new ArrayList<>();

	public Bank(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public void setAccount(Account account) {
		accounts.add(account);
	}

	public void listAccounts() {

		if (this.accounts.size() == 0) {
			System.out.println("NO REGISTERED ACCOUNT !");
			return;
		}

		System.out.println("\n*** BANK ACCOUNT LIST ***");
		for (Account account : this.getAccounts()) {
			account.getStatus();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
