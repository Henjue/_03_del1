package com.cdio.spil;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class TestAfRandom {
    public static void main(String[] args) {
        int i, runs, et = 0, to = 0, tre = 0, fire = 0, fem = 0, seks = 0, x, y;
        System.out.print("Indtast antal runs  "); //lader brugeren definere antal runs
        System.out.println("(NB: Antal runs ganges med 2, da der er to terninger)");
        Scanner scan = new Scanner(System.in);
        runs = scan.nextInt();
        Random random = new Random();
        int terningSideAntal = 6;
        for (i = 0; i < runs; i++){
            x = random.nextInt(terningSideAntal) + 1;
            y = random.nextInt(terningSideAntal) + 1;
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

        double teoriSnit = runs*(1/(double)terningSideAntal);
        double accuracyEt = (((double)et-teoriSnit)/teoriSnit)*100;

        double accuracyTo = (((double)to-teoriSnit)/teoriSnit)*100;

        double accuracyTre = (((double)tre-teoriSnit)/teoriSnit)*100;

        double accuracyFire = (((double)fire-teoriSnit)/teoriSnit)*100;

        double accuracyFem = (((double)fem-teoriSnit)/teoriSnit)*100;

        double accuracySeks = (((double)seks-teoriSnit)/teoriSnit)*100;

        // Test af accuracy - burde altid returnere end værdi på 100
        double totalAccuracy = (accuracyEt+accuracyTo+accuracyTre+accuracyFire+accuracyFem+accuracySeks)/terningSideAntal;

        System.out.print("\ntotalAccuracy returned status: ");
        if ((int)totalAccuracy == 100) {
            System.out.print("ok");
        }
        else {
            System.out.print("a problem occured");
        }
        System.out.println("\n(Teoretisk gennemsnitsgrænse ~" + Math.round(teoriSnit*2) + ")");

        System.out.println("Total af etere = " + et);
        System.out.println("Total af toere = " + to);
        System.out.println("Total af treere = " + tre);
        System.out.println("Total af firere = " + fire);
        System.out.println("Total af femere = " + fem);
        System.out.println("Total af seksere = " + seks);


        double lowestAccuracy1 = Math.max(accuracyEt, Math.max(accuracyTo, accuracyTre));
        double lowestAccuracy2 = Math.max(accuracyFire, Math.max(accuracyFem, accuracySeks));
        double lowestAccuracyFinal = Math.max(lowestAccuracy1, lowestAccuracy2);
        System.out.print("\nTerningerne har en præcisionsgrad på: ");
        System.out.format("%.2f", lowestAccuracyFinal);
        System.out.print("%");

    }
}
