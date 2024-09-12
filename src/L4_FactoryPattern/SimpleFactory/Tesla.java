package L4_FactoryPattern.SimpleFactory;

public class Tesla implements Car{
    @Override
    public void drive() {
        System.out.println("Driving Tesla.");
    }
}
