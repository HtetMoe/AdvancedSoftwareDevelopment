package L4_FactoryPattern.AbstractFactory.AF_Furniture.products;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }
}
