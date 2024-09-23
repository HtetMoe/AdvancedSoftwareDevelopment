package L10_ProxyPattern.ProtectionProxy;

public class Main {
    public static void main(String[] args) {
        Document adminDoc = new ProxyDocument("admin");
        adminDoc.view();
        adminDoc.edit();


        Document viewerDoc = new ProxyDocument("viewer");
        viewerDoc.view();
        viewerDoc.edit();
    }
}
