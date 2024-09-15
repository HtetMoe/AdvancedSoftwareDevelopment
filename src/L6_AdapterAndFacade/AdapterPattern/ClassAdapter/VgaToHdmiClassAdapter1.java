package L6_AdapterAndFacade.AdapterPattern.ClassAdapter;

import L6_AdapterAndFacade.AdapterPattern.ObjectAdapter.target.HdmiDisplay;
import L6_AdapterAndFacade.AdapterPattern.ObjectAdapter.adaptee.VgaDisplay;

public class VgaToHdmiClassAdapter1 extends VgaDisplay implements HdmiDisplay {

    @Override
    public void displayWithHDMI() {
        displayWithVGA();// Inherited from VgaDisplay
    }
}


