package L4_FactoryPattern.FactoryMethod.product;

//Concrete Products
public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
