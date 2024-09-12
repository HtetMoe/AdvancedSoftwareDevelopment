package L4_FactoryPattern.FactoryMethodPattern;

//Concrete Products
public class Dog implements Animal{
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
