package Labs.StatePattern;

import Labs.StatePattern.context.CeilingFan;

//Client class
public class Application {
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        fan.pullGreen();
        fan.pullGreen();
        fan.pullGreen();
        fan.pullGreen();
        fan.pullRed();
        fan.pullRed();
    }
}
