package L6_AdapterAndFacade.AdapterPattern;

/*
    We have a VgaDisplay and a client that only supports HdmiDisplay.
    We’ll use an adapter to connect the two.
 */

//VGA to HDMI Adapter
public class VgaToHdmiAdapter implements HdmiDisplay{
    private VgaDisplay vgaDisplay; // wrap the object, as decorator

    public VgaToHdmiAdapter(VgaDisplay vgaDisplay) {
        this.vgaDisplay = vgaDisplay;
    }

    @Override
    public void displayWithHDMI() {
        vgaDisplay.displayWithVGA(); // internally uses VGA display functionality
    }
}
