package com.cdio.spil;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Main {
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
        }


        double totalSlag = (to+tre+fire+fem+seks+syv+otte+ni+ti+elleve+tolv);

        double fordelingTo = (to/totalSlag);
        double fordelingTre = (tre/totalSlag);
        double fordelingFire = (fire/totalSlag);
        double fordelingFem = (fem/totalSlag);
        double fordelingSeks = (seks/totalSlag);
        double fordelingSyv = (syv/totalSlag);
        double fordelingOtte = (otte/totalSlag);
        double fordelingNi = (ni/totalSlag);
        double fordelingTi = (ti/totalSlag);
        double fordelingElleve = (elleve/totalSlag);
        double fordelingTolv = (tolv/totalSlag);



        //Printer svarene
        System.out.println("Total sum to     = " + to + " - Fordeling: " + Math.round(fordelingTo*100) + "%");
        System.out.println("Total sum tre    = " + tre + " - Fordeling: " + Math.round(fordelingTre*100) + "%");
        System.out.println("Total sum fire   = " + fire + " - Fordeling: " + Math.round(fordelingFire*100) + "%");
        System.out.println("Total sum fem    = " + fem + " - Fordeling: " + Math.round(fordelingFem*100) + "%");
        System.out.println("Total sum seks   = " + seks + " - Fordeling: " + Math.round(fordelingSeks*100) + "%");
        System.out.println("Total sum syv    = " + syv + " - Fordeling: " + Math.round(fordelingSyv*100) + "%");
        System.out.println("Total sum otte   = " + otte + " - Fordeling: " + Math.round(fordelingOtte*100) + "%");
        System.out.println("Total sum ni     = " + ni + " - Fordeling: " + Math.round(fordelingNi*100) + "%");
        System.out.println("Total sum ti     = " + ti + " - Fordeling: " + Math.round(fordelingTi*100) + "%");
        System.out.println("Total sum elleve = " + elleve + " - Fordeling: " + Math.round(fordelingElleve*100) + "%");
        System.out.println("Total sum tolv   = " + tolv + " - Fordeling: " + Math.round(fordelingTolv*100) + "%");





    }
}
