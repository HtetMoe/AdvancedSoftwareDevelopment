package L4_FactoryPattern.SimpleFactory;

public class BMW implements Car{
    @Override
    public void drive() {
        System.out.println("Driving BMW.");
    }
}
