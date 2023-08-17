package org.example;

import java.util.Scanner;

public class Player {
    private String name;
    private Scanner scanner;

    public Player(String name) {
        this.name = name;
        this.scanner = new Scanner(System.in);
    }
    public String getName() {
        return name;
    }

    public Move makeMove() {
        System.out.println(name + ", please choose your move (rock, paper, scissors):");
        String input = scanner.nextLine().trim().toLowerCase();
        switch (input) {
            case "rock":
                return Move.ROCK;
            case "paper":
                return Move.PAPER;
            case "scissors":
                return Move.SCISSORS;
            default:
                System.out.println("Invalid move. Please choose again.");
                return makeMove();
        }
    }
}
