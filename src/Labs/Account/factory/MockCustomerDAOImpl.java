package Labs.Account.factory;
import Labs.Account.Customer;

import java.util.ArrayList;
import java.util.Collection;

public class MockCustomerDAOImpl implements CustomerDAO {
    private Collection<Customer> customerList = new ArrayList<>(); // In-memory storage for customers

    @Override
    public void saveCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        Customer existingCustomer = loadCustomer(customer.getName()); // Find the customer
        if (existingCustomer != null) {
            customerList.remove(existingCustomer); // Remove the old customer
            customerList.add(customer); // Add the updated customer
        }
    }

    @Override
    public Customer loadCustomer(String customerId) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(customerId)) { // Assuming name is used as ID
                return customer;
            }
        }
        return null; // Return null if the customer is not found
    }

    @Override
    public void deleteCustomer(String customerId) {
        Customer customer = loadCustomer(customerId); // Find the customer
        if (customer != null) {
            customerList.remove(customer); // Remove the customer from the list
        }
    }

    @Override
    public Collection<Customer> getAllCustomers() {
        return customerList; // Return the collection of customers
    }
}
