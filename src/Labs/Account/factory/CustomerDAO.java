package Labs.Account.factory;

import Labs.Account.Customer;

import java.util.Collection;

public interface CustomerDAO {
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    Customer loadCustomer(String customerId);
    void deleteCustomer(String customerId);
    Collection<Customer> getAllCustomers();
}
