package L4_FactoryPattern.FactoryMethodPattern;

import L4_FactoryPattern.FactoryMethodPattern.creators.AnimalFactory;
import L4_FactoryPattern.FactoryMethodPattern.creators.CatFactory;
import L4_FactoryPattern.FactoryMethodPattern.creators.DogFactory;

//client code
public class FactoryMethodDemo {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        dogFactory.describeAnimal(); // Output: Woof!

        AnimalFactory catFactory = new CatFactory();
        catFactory.describeAnimal(); // Output: Meow!
    }
}
