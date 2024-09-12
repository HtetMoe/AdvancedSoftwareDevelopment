package Labs.Account.factory;

import Labs.Account.AccountDAO;
import Labs.Account.AccountDAOImpl;
import Labs.Account.MockAccountDAOImpl;

public class AccountCustomerDAOFactory {
    public static AccountDAO getAccountDAO(String environment) {

        //real database implementation
        if (environment.equalsIgnoreCase("production")) {
            return new AccountDAOImpl();
        }
        //in-memory implementation for testing
        else if (environment.equalsIgnoreCase("test")) {
            return new MockAccountDAOImpl();
        } else {
            throw new IllegalArgumentException("Unknown environment: " + environment);
        }
    }

    public static CustomerDAO getCustomerDAO(String environment) {
        if (environment.equalsIgnoreCase("production")) {
            return new CustomerDAOImpl();
        }
        else if (environment.equalsIgnoreCase("test")) {
            return new MockCustomerDAOImpl();
        }
        else {
            throw new IllegalArgumentException("Unknown environment: " + environment);
        }
    }
}
