package L4_FactoryPattern.AF_Furniture.products;

public class VictorianChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair.");
    }
}
