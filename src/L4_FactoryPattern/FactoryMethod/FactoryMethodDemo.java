package L4_FactoryPattern.FactoryMethod;

import L4_FactoryPattern.FactoryMethod.creators.AnimalFactory;
import L4_FactoryPattern.FactoryMethod.creators.CatFactory;
import L4_FactoryPattern.FactoryMethod.creators.DogFactory;
import L4_FactoryPattern.FactoryMethod.product.Dog;

//client code
public class FactoryMethodDemo {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        dogFactory.describeAnimal(); // Output: Woof!

        AnimalFactory catFactory = new CatFactory();
        catFactory.describeAnimal(); // Output: Meow!
    }
}
