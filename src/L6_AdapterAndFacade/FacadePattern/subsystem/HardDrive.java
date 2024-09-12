package L6_AdapterAndFacade.FacadePattern.subsystem;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive reading data from sector " + lba);
        return new byte[size]; // Simulating read data
    }
}
