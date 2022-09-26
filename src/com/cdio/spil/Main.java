package com.cdio.spil;
import java.util.Random;
// Temporary test Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test scanner
        Scanner scanner = new Scanner(System.in);
        int x, y, player_1 = 0, player_2 = 0;
        while(true) {
            Random random = new Random();
            x = random.nextInt(6) + 1;
            y = random.nextInt(6) + 1;
            if (x==1 && y==1) {
                System.out.println("Player 1 has rolled two " + x + "'s\n and loses all points");
                System.out.println("Press enter to continue...");
                scanner.nextLine();

            }
            System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
            player_1 = player_1 + x + y;
            System.out.println("Player 1 score is " + player_1);
            x = random.nextInt(6) + 1;
            y = random.nextInt(6) + 1;

            if (x==1 && y==1) {
                System.out.println("Player 1 has rolled two " + x + "'s\n and loses all points");
                System.out.println("Press enter to continue...");
                player_1 = 0;
                scanner.nextLine();
            }
            // TODO: Does player get an extra roll after playing two 1's?
            else if (x==y) {
                boolean lastThrowSix = false;
                System.out.println("Player 1 has rolled two " + x + "'s\n and may roll again");
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                if (x==6) {
                    lastThrowSix = true;
                }
                x = random.nextInt(6) + 1;
                y = random.nextInt(6) + 1;
                if (x==y && x==6 && lastThrowSix) {
                    System.out.println("Player 1 rolled two " + x + "'s and has won the game!");
                    break;
                }
                player_1 = player_1 + x + y;

            }

            System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
            player_2 = player_2 + x + y;
            System.out.println("Player 2 score is " + player_2);

            if (player_1 >=40 && player_1 == player_2)
            {
                System.out.println("Uafgjort");
                break;
            }
            else if (player_1 >= 40 && player_2 < player_1)
            {
                System.out.printf("Player 1 wins with " + player_1 + " points," + (player_1 - player_2) + " ahead of player 2");
                break;
            }
            else if (player_2 >=40)
            {
                System.out.printf("Player 2 wins with " + player_2 + " points," + (player_2 - player_1) + " ahead of player 1");
                break;
            }
        }
    }
}
