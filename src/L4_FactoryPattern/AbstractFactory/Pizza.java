package L4_FactoryPattern.AbstractFactory;

import L4_FactoryPattern.AbstractFactory.products.Dough;
import L4_FactoryPattern.AbstractFactory.products.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;

    abstract void prepare(); // Preparation will use the factory to get ingredients

    void bake() {
        System.out.println("Baking " + name);
    }

    void cut() {
        System.out.println("Cutting " + name);
    }

    void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
