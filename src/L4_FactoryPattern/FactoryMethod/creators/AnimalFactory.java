package L4_FactoryPattern.FactoryMethod.creators;

import L4_FactoryPattern.FactoryMethod.product.Animal;

// Creator abstract class
public abstract class AnimalFactory {

    public abstract Animal createAnimal();

    public void describeAnimal() {
        Animal animal = createAnimal();
        animal.speak();
    }
}
