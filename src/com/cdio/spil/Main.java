package com.cdio.spil;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x, y, player_1 = 0, player_2 = 0;
        String b;
        Scanner spil;
        while(true) {
            Random random = new Random();
            spil = new Scanner(System.in);
            System.out.println("\n" + "Player 1, press enter to roll the die");
            b = spil.nextLine();
            x = random.nextInt(6) + 1;
            y = random.nextInt(6) + 1;
            System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
            player_1 = player_1 + x + y;
            System.out.println("Player 1 score is " + player_1);
            if (x==1 && y==1) {
                System.out.println("Player 1 has rolled two " + x + "'s\n and loses all points");
                System.out.println("Press enter to continue...");
                player_1 = 0;
                System.out.println("\n" + "Player 1 score is " + player_1);
            }
            spil = new Scanner(System.in);
            System.out.println("\n" + "Player 2, press enter to roll the die");
            b = spil.nextLine();
            x = random.nextInt(6) + 1;
            y = random.nextInt(6) + 1;
            System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
            player_2 = player_2 + x + y;
            System.out.println("Player 2 score is " + player_2);
            if (x==1 && y==1) {
                System.out.println("Player 2 has rolled two " + x + "'s\n and loses all points");
                System.out.println("Press enter to continue...");
                player_2 = 0;
                System.out.println("\n" + "Player 2 score is " + player_2);
            }

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
