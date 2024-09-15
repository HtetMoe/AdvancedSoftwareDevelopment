package L4_FactoryPattern.AF_Furniture;

import L4_FactoryPattern.AF_Furniture.factory.FurnitureFactory;
import L4_FactoryPattern.AF_Furniture.factory.ModernFurnitureFactory;
import L4_FactoryPattern.AF_Furniture.factory.VictorianFurnitureFactory;
import L4_FactoryPattern.AF_Furniture.products.Chair;
import L4_FactoryPattern.AF_Furniture.products.Sofa;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        //Modern furniture factory
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();

        // Use the Modern furniture
        modernChair.sitOn(); // Output: Sitting on a modern chair.
        modernSofa.lieOn();  // Output: Lying on a modern sofa.

        //Victorian furniture factory
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();

        // Use the Victorian furniture
        victorianChair.sitOn(); // Output: Sitting on a Victorian chair.
        victorianSofa.lieOn();  // Output: Lying on a Victorian sofa.
    }
}
