package L4_FactoryPattern.AF_Furniture.factory;

import L4_FactoryPattern.AF_Furniture.products.Chair;
import L4_FactoryPattern.AF_Furniture.products.Sofa;
import L4_FactoryPattern.AF_Furniture.products.VictorianChair;
import L4_FactoryPattern.AF_Furniture.products.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
