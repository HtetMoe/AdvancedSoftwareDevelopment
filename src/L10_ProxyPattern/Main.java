package L10_ProxyPattern;

import L10_ProxyPattern.subject.Image;

public class Main {
    public static void main(String[] args) {
        // Create proxy instance
        Image image = new ProxyImage("test_image.jpg");

        // Image will be loaded from disk and displayed
        image.display();

        // Image will not be loaded from disk again
        image.display();
    }
}
