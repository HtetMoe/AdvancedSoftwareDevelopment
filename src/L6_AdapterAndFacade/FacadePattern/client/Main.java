package L6_AdapterAndFacade.FacadePattern.client;

import L6_AdapterAndFacade.FacadePattern.facade.ComputerFacade;

public class Main {
    public static void main(String[] args) {
        // Client only interacts with the facade to start the computer
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
