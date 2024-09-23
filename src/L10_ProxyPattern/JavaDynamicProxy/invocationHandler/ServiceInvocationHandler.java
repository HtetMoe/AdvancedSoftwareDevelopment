package L10_ProxyPattern.JavaDynamicProxy.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Step 3: Create an InvocationHandler for proxy behavior
public class ServiceInvocationHandler implements InvocationHandler {
    private Object target;

    public ServiceInvocationHandler(Object target) {
        this.target = target;
    }

    //The dynamic proxy logs method calls before and after execution.
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(STR."Method :\{method.getName()} is called.");

        Object result = method.invoke(target, args); // Invoke the actual method
        System.out.println(STR."Method : \{method.getName()} finished.");
        return result;
    }

}
