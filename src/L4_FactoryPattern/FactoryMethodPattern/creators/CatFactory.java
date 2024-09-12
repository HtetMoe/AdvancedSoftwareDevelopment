package L4_FactoryPattern.FactoryMethodPattern.creators;

import L4_FactoryPattern.FactoryMethodPattern.Animal;
import L4_FactoryPattern.FactoryMethodPattern.Cat;

public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
