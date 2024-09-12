package L7_TemplateMethodPattern;

//Template Abstract class
public abstract class Game {
    // Template method
    public final void play() {
        start();
        playTurn();
        end();
    }

    // Steps to be implemented by subclasses
    protected abstract void start();
    protected abstract void playTurn();
    protected abstract void end();
    public void hook(){

    }
}
