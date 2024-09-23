package L10_ProxyPattern.BankServiceDynamicProxy;

import L10_ProxyPattern.BankServiceDynamicProxy.invocationHandler.SecurityAndLoggingHandler;
import L10_ProxyPattern.BankServiceDynamicProxy.subject.BankingService;
import L10_ProxyPattern.BankServiceDynamicProxy.subject.RealBankingService;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // Step 4: Create the real banking service instance
        BankingService realService = new RealBankingService();

        // Step 5: Create a dynamic proxy for the real service
        BankingService proxyService = (BankingService) Proxy.newProxyInstance(
                realService.getClass().getClassLoader(),
                new Class[]{BankingService.class},
                new SecurityAndLoggingHandler(realService)
        );

        // Step 6: Use the proxy service with dynamic behavior
        proxyService.deposit(100);  // Logs, authenticates, and deposits
        //proxyService.withdraw(50);  // Logs, authenticates, and withdraws
    }
}
