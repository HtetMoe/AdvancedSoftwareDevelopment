package L4_FactoryPattern.FactoryMethodPattern.creators;

import L4_FactoryPattern.FactoryMethodPattern.Animal;

// Creator abstract class
public abstract class AnimalFactory {

    public abstract Animal createAnimal();

    public void describeAnimal() {
        Animal animal = createAnimal();
        animal.speak();
    }
}
