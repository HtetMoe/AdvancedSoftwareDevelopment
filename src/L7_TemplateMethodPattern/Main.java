package L7_TemplateMethodPattern;

import L7_TemplateMethodPattern.concreteClasses.Chess;
import L7_TemplateMethodPattern.concreteClasses.Football;

public class Main {
    public static void main(String[] args) {
        Game chess = new Chess();
        chess.play();  // Play chess

        Game football = new Football();
        football.play();  // Play football
    }
}
