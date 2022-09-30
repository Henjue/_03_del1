package com.cdio.spil;
import java.util.Random;
import java.util.Scanner;
public class TestAfRandom {
    public static void main(String[] args) {
        int i, runs, et = 0, to = 0, tre = 0, fire = 0, fem = 0, seks = 0, x, y;
        System.out.print("Indtast antal runs  "); //lader brugeren definere antal runs
        System.out.println("(NB: Antal runs ganges med 2, da der er to terninger)");
        Scanner scan = new Scanner(System.in);
        runs = scan.nextInt();
        Random random = new Random();
        for (i = 0; i < runs; i++){
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
