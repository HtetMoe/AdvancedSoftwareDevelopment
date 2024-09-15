package L4_FactoryPattern.AF_Furniture.factory;

import L4_FactoryPattern.AF_Furniture.products.Chair;
import L4_FactoryPattern.AF_Furniture.products.ModernChair;
import L4_FactoryPattern.AF_Furniture.products.ModernSofa;
import L4_FactoryPattern.AF_Furniture.products.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
