package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock-Paper-Scissors Game!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        Game game = new Game(playerName);

        int totalGames = 0;
        int playerWins = 0;
        int computerWins = 0;

        boolean continuePlaying = true;
        while (continuePlaying) {
            game.playRound();
            totalGames++;

            System.out.print("Do you want to continue playing? (yes/no): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("no")) {
                continuePlaying = false;
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("Total games played: " + totalGames);
        System.out.println(playerName + " wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);

        scanner.close();
    }
}