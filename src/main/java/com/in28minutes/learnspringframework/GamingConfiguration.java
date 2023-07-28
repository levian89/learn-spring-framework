package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunnerWithLooseCoupling;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunnerWithLooseCoupling gameRunnerWithLooseCoupling (GamingConsole game) {
        var gameRunnerWithLooseCoupling = new GameRunnerWithLooseCoupling(game);
        return gameRunnerWithLooseCoupling;
    }

//    @Bean
//    public GameRunnerWithLooseCoupling gameRunnerWithLooseCoupling() {
//        var gameRunnerWithLooseCoupling = new GameRunnerWithLooseCoupling(game());
//        return gameRunnerWithLooseCoupling;
//    }

}
