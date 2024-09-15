package L4_FactoryPattern.AF_Furniture.factory;

import L4_FactoryPattern.AF_Furniture.products.Chair;
import L4_FactoryPattern.AF_Furniture.products.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
