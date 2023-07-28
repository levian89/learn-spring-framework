package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.*;

public class App01GamingBasicJavaWithLooseCoupling {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();   //1: Object Creation
        var gameRunner = new GameRunnerWithLooseCoupling(game); // "game" it is injected/wired into GameRunner...
        //2: Object Creation + Wiring of Dependencies
        //"game"(GamingConsole) is a Dependency of GameRunnerWithLooseCoupling
        gameRunner.run();
    }
}
