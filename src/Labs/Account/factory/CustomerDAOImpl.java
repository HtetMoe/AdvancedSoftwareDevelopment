package Labs.Account.factory;

import Labs.Account.Customer;

import java.util.ArrayList;
import java.util.Collection;

public class CustomerDAOImpl implements CustomerDAO{
    private Collection<Customer> customerList = new ArrayList<>();

    @Override
    public void saveCustomer(Customer customer) {
        // Simulate saving to a real database
        customerList.add(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        Customer existingCustomer = loadCustomer(customer.getName());
        if (existingCustomer != null) {
            customerList.remove(existingCustomer);
            customerList.add(customer);
        }
    }

    @Override
    public Customer loadCustomer(String customerId) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void deleteCustomer(String customerId) {
        Customer customer = loadCustomer(customerId);
        if (customer != null) {
            customerList.remove(customer);
        }
    }

    @Override
    public Collection<Customer> getAllCustomers() {
        return customerList;
    }
}
