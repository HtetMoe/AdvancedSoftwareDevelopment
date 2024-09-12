package L4_FactoryPattern.SimpleFactory;

public class CarFactory {
    public static Car createCar(String type) {
        if(type == null) return null;

        switch (type) {
            case "BMW": return new BMW();
            case "Tesla": return new Tesla();
            default: throw new IllegalArgumentException("Invalid type");
        }
    }
}
