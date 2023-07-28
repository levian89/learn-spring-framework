package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunnerWithTightCoupling;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class App01GamingBasicJavaWithTightCoupling {
    public static void main(String[] args) {
//        var marioGame = new MarioGame();  // tight coupling: if I want to run the marioGame, I need to change the code
                                          // in the GameRunner (without interface)
//        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();
        var gameRunner = new GameRunnerWithTightCoupling(pacmanGame);
        gameRunner.run();
    }
}
