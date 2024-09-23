package L10_ProxyPattern.VirtualProxy;

// Real object that the proxy will represent
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println(STR."Loading \{fileName}");
    }

    @Override
    public void display() {
        System.out.println(STR."Displaying \{fileName}");
    }
}
