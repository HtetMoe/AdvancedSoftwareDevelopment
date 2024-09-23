package L10_ProxyPattern.BankServiceDynamicProxy.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SecurityAndLoggingHandler implements InvocationHandler {
    private Object target; // real object

    public SecurityAndLoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // Authentication check
        if (isAuthenticated()) {
            System.out.println("User authenticated.");

            // Logging
            System.out.println(STR."Logging: Calling \{method.getName()} with \{args[0]}");

            // Call the actual method on the target (real service)
            Object result = method.invoke(target, args);

            // Post-logging
            System.out.println(STR."Logging: Completed \{method.getName()}");

            return result;
        } else {
            System.out.println("User not authenticated!");
            return null;
        }
    }

    private boolean isAuthenticated() {
        // Simulating an authentication check (you can expand it)
        return true;  // Assume user is authenticated
    }
}
