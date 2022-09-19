package com.cdio.spil;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(6) + 1;
        System.out.println(x);
    }
}
