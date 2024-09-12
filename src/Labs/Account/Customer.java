package Labs.Account;

public class Customer {
	private String name;
	private String customerId;

	public Customer(String name) {
		this.name = name;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Customer customer = (Customer) obj;

		if (!customerId.equals(customer.customerId)) return false;
		return name.equals(customer.name);
	}
}
