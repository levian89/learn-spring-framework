package com.in28minutes.learnspringframework.game;

public class GameRunnerWithLooseCoupling {

    private GamingConsole game;

    public GameRunnerWithLooseCoupling(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
