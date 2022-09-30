package com.cdio.spil;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int i, et = 0, to = 0, tre = 0, fire = 0, fem = 0, seks = 0, x, y;
        Random random = new Random();
        for (i = 0; i <= 1000000; i++){
            x = random.nextInt(6) + 1;
            y = random.nextInt(6) + 1;
            switch (x) { //tester for terning x
                case 1 -> et++;
                case 2 -> to++;
                case 3 -> tre++;
                case 4 -> fire++;
                case 5 -> fem++;
                case 6 -> seks++;
            } //tester for terning y
            switch (y) {
                case 1 -> et++;
                case 2 -> to++;
                case 3 -> tre++;
                case 4 -> fire++;
                case 5 -> fem++;
                case 6 -> seks++;
            }
        } //Printer svarene
        System.out.println("Total af etere = " + et);
        System.out.println("Total af toere = " + to);
        System.out.println("Total af treere = " + tre);
        System.out.println("Total af firere = " + fire);
        System.out.println("Total af femere = " + fem);
        System.out.println("Total af seksere = " + seks);


    }
}
