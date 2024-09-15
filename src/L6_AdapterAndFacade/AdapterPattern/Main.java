package L6_AdapterAndFacade.AdapterPattern;

import L6_AdapterAndFacade.AdapterPattern.ObjectAdapter.adaptee.VgaDisplay;
import L6_AdapterAndFacade.AdapterPattern.ObjectAdapter.adapter.Adapter;
import L6_AdapterAndFacade.AdapterPattern.ObjectAdapter.target.HdmiDisplay;

//Client
public class Main {
    public static void main(String[] args) {
        VgaDisplay vgaDisplay   = new VgaDisplay();
        HdmiDisplay hdmiDisplay = new Adapter(vgaDisplay); //adapter to convert VGA to HDMI

        // show existing display with new interface
        hdmiDisplay.displayWithHDMI(); // client can use the HDMI interface
    }
}
