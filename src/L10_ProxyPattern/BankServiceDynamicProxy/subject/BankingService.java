package L10_ProxyPattern.BankServiceDynamicProxy.subject;

// Step 1: Define the Banking Service interface
public interface BankingService {
    void withdraw(double amount);
    void deposit(double amount);
}
