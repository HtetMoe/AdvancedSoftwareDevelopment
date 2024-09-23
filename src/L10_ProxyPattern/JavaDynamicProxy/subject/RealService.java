package L10_ProxyPattern.JavaDynamicProxy.subject;

// Step 2: Implement the interface with a real class
public class RealService implements Service{

    @Override
    public void perform() {
        System.out.println("Performing the real service...");
    }
}
