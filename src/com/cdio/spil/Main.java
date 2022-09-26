package com.cdio.spil;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int x, y, player_1 = 0, player_2 = 0;
        while(true) {
            Random random = new Random();
            x = random.nextInt(6) + 1;
            y = random.nextInt(6) + 1;
            System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
            player_1 = player_1 + x + y;
            System.out.println("Player 1 score is " + player_1);
            x = random.nextInt(6) + 1;
            y = random.nextInt(6) + 1;
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
