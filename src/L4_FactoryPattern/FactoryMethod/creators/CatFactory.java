package L4_FactoryPattern.FactoryMethod.creators;

import L4_FactoryPattern.FactoryMethod.product.Animal;
import L4_FactoryPattern.FactoryMethod.product.Cat;

public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
