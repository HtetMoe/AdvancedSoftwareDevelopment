package L4_FactoryPattern.AbstractFactory.AF_Furniture.products;

public class VictorianSofa implements Sofa{
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian sofa.");
    }
}
