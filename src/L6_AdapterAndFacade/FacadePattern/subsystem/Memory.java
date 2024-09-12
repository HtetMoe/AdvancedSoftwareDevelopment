package L6_AdapterAndFacade.FacadePattern.subsystem;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory loading data at position " + position);
    }
}
