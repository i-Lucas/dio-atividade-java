package customer;

public class Customer implements ICustomer {

	private String name;

	public Customer(String name) {
		this.name = name;
	}

	@Override
	public Customer getCustomer() {
		return this;
	}

	@Override
	public String getCustomerName() {
		return this.name;
	}
}
