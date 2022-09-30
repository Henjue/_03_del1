package com.cdio.spil;
import java.util.Random;
import java.util.Scanner;
public class TestAfRandom {
    public static void main(String[] args) {
        int i, runs, to = 0, tre = 0, fire = 0, fem = 0, seks = 0, syv = 0, otte = 0, ni = 0, ti = 0, elleve = 0, tolv = 0, x, y;
        System.out.print("Indtast antal runs  "); //lader brugeren definere antal runs
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        runs = scan.nextInt();
        Random random = new Random();
        for (i = 0; i < runs; i++){
            x = random.nextInt(6) + 1;
            y = random.nextInt(6) + 1;
            switch (x+y) {
                case 2 -> to++;
                case 3 -> tre++;
                case 4 -> fire++;
                case 5 -> fem++;
                case 6 -> seks++;
                case 7 -> syv++;
                case 8 -> otte++;
                case 9 -> ni++;
                case 10 -> ti++;
                case 11 -> elleve++;
                case 12 -> tolv++;
            }
        } //Printer svarene
        System.out.println("Total sum to  = " + to);
        System.out.println("Total sum tre = " + tre);
        System.out.println("Total sum fire = " + fire);
        System.out.println("Total sum fem = " + fem);
        System.out.println("Total sum seks = " + seks);
        System.out.println("Total sum syv = " + syv);
        System.out.println("Total sum otte = " + otte);
        System.out.println("Total sum ni = " + ni);
        System.out.println("Total sum ti = " + ti);
        System.out.println("Total sum elleve = " + elleve);
        System.out.println("Total sum tolv = " + tolv);
    }
}
