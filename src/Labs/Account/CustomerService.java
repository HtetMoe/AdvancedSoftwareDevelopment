package Labs.Account;

import java.util.Collection;

public interface CustomerService {
    Customer createCustomer(String customerId, String name);
    Customer getCustomer(String customerId);
    Collection<Customer> getAllCustomers();
    void updateCustomer(Customer customer);
    void deleteCustomer(String customerId);
}
