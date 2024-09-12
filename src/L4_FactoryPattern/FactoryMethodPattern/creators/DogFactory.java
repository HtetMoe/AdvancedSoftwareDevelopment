package L4_FactoryPattern.FactoryMethodPattern.creators;

import L4_FactoryPattern.FactoryMethodPattern.Animal;
import L4_FactoryPattern.FactoryMethodPattern.Dog;

// Concrete Creators
public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
