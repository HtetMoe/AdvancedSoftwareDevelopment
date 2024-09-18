package L10_ProxyPattern;

import L10_ProxyPattern.realSubject.RealImage;
import L10_ProxyPattern.subject.Image;

// Proxy Class
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Lazily initialize RealImage and display it
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
