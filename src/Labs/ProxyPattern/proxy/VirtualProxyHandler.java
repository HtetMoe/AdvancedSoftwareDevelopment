package Labs.ProxyPattern.proxy;

import Labs.ProxyPattern.subject.ComplexTask;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class VirtualProxyHandler implements InvocationHandler {
    private Object target;
    private final Class<?> realClass;

    public VirtualProxyHandler(Class<?> realClass) {
        this.realClass = realClass; // capture the class type of the real object
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (target == null) {
            System.out.println("Creating real object...");
            target = (ComplexTask) realClass.getConstructor().newInstance(); // Instantiate the real object
        }
        return method.invoke(target, args); // delegate the method call to the real object
    }

    //create the dynamic proxy
    public static ComplexTask createProxy(Class<?> realClass) {
        return (ComplexTask) Proxy.newProxyInstance(
                realClass.getClassLoader(),
                new Class<?>[]{ComplexTask.class},
                new VirtualProxyHandler(realClass)
        );
    }
}
