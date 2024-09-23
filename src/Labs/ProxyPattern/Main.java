package Labs.ProxyPattern;

import Labs.ProxyPattern.proxy.VirtualProxyHandler;
import Labs.ProxyPattern.subject.RealComplexClass;
import Labs.ProxyPattern.subject.ComplexTask;

public class Main {
    public static void main(String[] args) {

        // create a proxy for ComplexClass using the dynamic proxy
        ComplexTask proxy = VirtualProxyHandler.createProxy(RealComplexClass.class);
        System.out.println("Proxy created, no real object instantiated yet.");

        proxy.veryComplicatedTask(); // instantiate ComplexClass and call the method
        proxy.veryComplicatedTask(); // the object should already be instantiated
    }
}
