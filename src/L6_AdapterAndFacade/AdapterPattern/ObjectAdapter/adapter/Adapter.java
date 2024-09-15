package L6_AdapterAndFacade.AdapterPattern.ObjectAdapter.adapter;

/*
    We have a VgaDisplay and a client that only supports HdmiDisplay.
    We’ll use an adapter to connect the two.
 */

import L6_AdapterAndFacade.AdapterPattern.ObjectAdapter.adaptee.VgaDisplay;
import L6_AdapterAndFacade.AdapterPattern.ObjectAdapter.target.HdmiDisplay;

//VGA to HDMI Adapter
public class Adapter implements HdmiDisplay {
    private VgaDisplay vgaDisplay; // wrap the object, as decorator

    public Adapter(VgaDisplay vgaDisplay) {
        this.vgaDisplay = vgaDisplay;
    }

    @Override
    public void displayWithHDMI() {
        vgaDisplay.displayWithVGA(); // internally uses VGA display functionality
    }
}
