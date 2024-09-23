package L10_ProxyPattern.ProtectionProxy;

//Create the Protection Proxy class to control access realDoc
public class ProxyDocument implements Document{
    private String userRole;
    private RealDocument realDocument; // reference to RealDoc

    public ProxyDocument(String role) {
        this.userRole = role;
        this.realDocument = new RealDocument(role);
    }


    @Override
    public void view() {
        realDocument.view(); // anyone can view
    }

    @Override
    public void edit() {
        if(userRole.equalsIgnoreCase("admin")){
            realDocument.edit();
        }
        else {
            System.out.println("Access denied!");
        }
    }
}
