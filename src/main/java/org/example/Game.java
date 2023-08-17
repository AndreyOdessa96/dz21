package org.example;

import java.util.Random;

public class Game {
    private Player player;
    private Random random;

    public Game(String playerName) {
        this.player = new Player(playerName);
        this.random = new Random();
    }

    public void playRound() {
        Move playerMove = player.makeMove();
        Move computerMove = getRandomMove();

        System.out.println("Computer chose: " + computerMove);

        if (playerMove == computerMove) {
            System.out.println("It's a tie!");
        } else if ((playerMove == Move.ROCK && computerMove == Move.SCISSORS) ||
                (playerMove == Move.PAPER && computerMove == Move.ROCK) ||
                (playerMove == Move.SCISSORS && computerMove == Move.PAPER)) {
            System.out.println(player.getName() + " wins!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    private Move getRandomMove() {
        int randomIndex = random.nextInt(Move.values().length);
        return Move.values()[randomIndex];
    }
}
