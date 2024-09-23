package L10_ProxyPattern.ProtectionProxy;

public class RealDocument implements Document{
    private String userRole;

    public RealDocument(String role) {
        this.userRole = role;
    }

    @Override
    public void view() {
        System.out.println(STR."Viewing document: \{userRole}");
    }

    @Override
    public void edit() {
        System.out.println(STR."Editing document: \{userRole}");
    }
}
