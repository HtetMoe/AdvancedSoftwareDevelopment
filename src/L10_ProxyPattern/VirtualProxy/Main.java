package L10_ProxyPattern.VirtualProxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("image.jpg"); // create proxy instance
        image.display(); //will be loaded from disk and displayed on first call
        image.display(); // will not be loaded again, just displayed
    }
}
