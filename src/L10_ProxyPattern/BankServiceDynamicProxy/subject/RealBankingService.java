package L10_ProxyPattern.BankServiceDynamicProxy.subject;

// Step 2: Implement the real Banking Service class
public class RealBankingService implements BankingService{
    @Override
    public void withdraw(double amount) {
        System.out.println(STR."Withdrawing: $\{amount}");
    }

    @Override
    public void deposit(double amount) {
        System.out.println(STR."Depositing: $\{amount}");
    }
}
