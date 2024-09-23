package L10_ProxyPattern.VirtualProxy;

// Proxy Class
public class ProxyImage implements Image {
    private String fileName;

    //reference to the realSubj, so that it can forward requests to subject
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);  // Lazy initialization
        }
        realImage.display();
    }
}
