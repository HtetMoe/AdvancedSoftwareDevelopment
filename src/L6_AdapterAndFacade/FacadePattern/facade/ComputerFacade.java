package L6_AdapterAndFacade.FacadePattern.facade;

import L6_AdapterAndFacade.FacadePattern.subsystem.CPU;
import L6_AdapterAndFacade.FacadePattern.subsystem.HardDrive;
import L6_AdapterAndFacade.FacadePattern.subsystem.Memory;

//Simplified Interface
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(0, hardDrive.read(100, 4096));
        cpu.jump(0);
        cpu.execute();
    }
}
