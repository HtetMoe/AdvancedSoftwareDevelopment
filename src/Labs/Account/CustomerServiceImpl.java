package Labs.Account;
import Labs.Account.factory.AccountCustomerDAOFactory;
import Labs.Account.factory.CustomerDAO;

import java.util.Collection;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDAO customerDAO;

    public CustomerServiceImpl(String environment) {
        this.customerDAO = AccountCustomerDAOFactory.getCustomerDAO(environment);
    }

    @Override
    public Customer createCustomer(String customerId, String name) {
        Customer customer = new Customer(name);
        customerDAO.saveCustomer(customer);
        return customer;
    }

    @Override
    public Customer getCustomer(String customerId) {
        Customer customer = customerDAO.loadCustomer(customerId);
        return customer;
    }

    @Override
    public Collection<Customer> getAllCustomers() {
        Collection<Customer> customers = customerDAO.getAllCustomers();
        return customers;
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDAO.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(String customerId) {
        customerDAO.deleteCustomer(customerId);
    }
}
