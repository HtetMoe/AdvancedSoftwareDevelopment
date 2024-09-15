package L4_FactoryPattern.FactoryMethod.product;

public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}
