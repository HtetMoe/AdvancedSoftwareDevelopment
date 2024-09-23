package L10_ProxyPattern.JavaDynamicProxy;

import L10_ProxyPattern.JavaDynamicProxy.invocationHandler.ServiceInvocationHandler;
import L10_ProxyPattern.JavaDynamicProxy.subject.RealService;
import L10_ProxyPattern.JavaDynamicProxy.subject.Service;

import java.lang.reflect.Proxy;

//Client
public class Main {
    public static void main(String[] args) {
        // Step 4: create the real object
        Service realService = new RealService();

        // Step 5: create a dynamic proxy for the real object
        Service proxyInstance = (Service) Proxy.newProxyInstance(
                realService.getClass().getClassLoader(),
                new Class[]{Service.class},
                new ServiceInvocationHandler(realService)
        ); // generates a proxy object at runtime

        // Step 6: use the proxy instance
        proxyInstance.perform();  // Output will include both before and after actions
    }
}
