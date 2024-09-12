package L6_AdapterAndFacade.AdapterPattern;

//Client
public class Main {
    public static void main(String[] args) {
        VgaDisplay vgaDisplay   = new VgaDisplay();
        HdmiDisplay hdmiDisplay = new VgaToHdmiAdapter(vgaDisplay); //adapter to convert VGA to HDMI

        // existing display
        hdmiDisplay.displayWithHDMI(); // client can use the HDMI interface
    }
}
