package L7_TemplateMethodPattern.concreteClasses;

import L7_TemplateMethodPattern.Game;

public class Chess extends Game {
    @Override
    protected void start() {
        System.out.println("Start chess game.");
    }

    @Override
    protected void playTurn() {
        System.out.println("Playing chess turn.");
    }

    @Override
    protected void end() {
        System.out.println("End chess game.");
    }

    @Override
    public void hook() {
        super.hook();
    }
}
