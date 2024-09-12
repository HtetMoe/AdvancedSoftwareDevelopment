package L6_AdapterAndFacade.AdapterPattern.ClassAdapter;

import L6_AdapterAndFacade.AdapterPattern.HdmiDisplay;
import L6_AdapterAndFacade.AdapterPattern.VgaDisplay;

public class VgaToHdmiClassAdapter1 extends VgaDisplay implements HdmiDisplay {

    @Override
    public void displayWithHDMI() {
        displayWithVGA();// Inherited from VgaDisplay
    }
}


