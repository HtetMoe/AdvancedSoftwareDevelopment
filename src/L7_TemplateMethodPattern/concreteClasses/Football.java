package L7_TemplateMethodPattern.concreteClasses;

import L7_TemplateMethodPattern.Game;

public class Football extends Game {
    @Override
    protected void start() {
        System.out.println("Start football match.");
    }

    @Override
    protected void playTurn() {
        System.out.println("Playing football turn.");
    }

    @Override
    protected void end() {
        System.out.println("End football match.");
    }
}
