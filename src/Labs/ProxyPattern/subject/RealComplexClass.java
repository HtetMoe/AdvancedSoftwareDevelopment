package Labs.ProxyPattern.subject;

public class RealComplexClass implements ComplexTask {

    public RealComplexClass() throws InterruptedException {
        System.out.println("Initializing complex class");
        super();
        Thread.sleep(10000); // Simulate expensive object creation
    }

    @Override
    public void veryComplicatedTask() {
        System.out.println("Very complicated task...");
    }
}
