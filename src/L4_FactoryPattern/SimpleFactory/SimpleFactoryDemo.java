package L4_FactoryPattern.SimpleFactory;

//client code
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        //Tesla
        Car tesla = CarFactory.createCar("Tesla");
        tesla.drive();

        //BMW
        Car BMW = CarFactory.createCar("BMW");
        BMW.drive();

    }
}
