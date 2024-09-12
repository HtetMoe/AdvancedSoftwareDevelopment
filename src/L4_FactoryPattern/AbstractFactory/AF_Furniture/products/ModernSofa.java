package L4_FactoryPattern.AbstractFactory.AF_Furniture.products;

public class ModernSofa implements Sofa{
    @Override
    public void lieOn() {
        System.out.println("Lying on a modern sofa.");
    }
}
