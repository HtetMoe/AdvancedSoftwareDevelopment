package L4_FactoryPattern.FactoryMethod.creators;

import L4_FactoryPattern.FactoryMethod.product.Animal;
import L4_FactoryPattern.FactoryMethod.product.Dog;

// Concrete Creators
public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
