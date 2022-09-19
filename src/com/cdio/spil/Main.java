package com.cdio.spil;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int x, y, player_1 = 0, player_2 = 0;
        Random random = new Random();
        x = random.nextInt(6) + 1;
        y = random.nextInt(6) + 1;
        System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
        player_1 = player_1+x+y;
        System.out.println(player_1);
        x = random.nextInt(6) + 1;
        y = random.nextInt(6) + 1;
        System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
        player_2 = player_2+x+y;
        System.out.println(player_2);
        //test
    }
}
