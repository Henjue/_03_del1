package com.cdio.spil;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        int i, runs, x, y;
        double et = 0, to = 0, tre = 0, fire = 0, fem = 0, seks = 0, syv = 0, otte = 0, ni = 0, ti = 0, elleve = 0, tolv = 0; //burde ikke være hardcoded til antal sider
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Vælg en af følgende test: \nTOTAL FORDELING AF TERNINGSUM (Tast 1)\nPRÆCISIONSGRAD AF FORDELINGEN AF ØJENTAL (Tast 2)");
        int testMenu = scan.nextInt();
        if (testMenu != 1 && testMenu != 2)
            System.out.println("Du skulle vælge 1 eller 2");
        System.out.print("Indtast antal runs  "); //lader brugeren definere antal runs
        runs = scan.nextInt();
        System.out.println(" ");

        if (testMenu == 1) {

            for (i = 0; i < runs; i++) {
                x = random.nextInt(6) + 1;
                y = random.nextInt(6) + 1;
                switch (x + y) {
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

            double fordelingTo = (to / runs);
            double fordelingTre = (tre / runs);
            double fordelingFire = (fire / runs);
            double fordelingFem = (fem / runs);
            double fordelingSeks = (seks / runs);
            double fordelingSyv = (syv / runs);
            double fordelingOtte = (otte / runs);
            double fordelingNi = (ni / runs);
            double fordelingTi = (ti / runs);
            double fordelingElleve = (elleve / runs);
            double fordelingTolv = (tolv / runs);

            //Printer svarene
            System.out.println("TOTAL FORDELING AF TERNINGSUM");
            System.out.println("Total sum to     = " + to + " - Fordeling: " + Math.round(fordelingTo * 100) + "% Forventet: 2.78%");
            System.out.println("Total sum tre    = " + tre + " - Fordeling: " + Math.round(fordelingTre * 100) + "% Forventet: 5.56%");
            System.out.println("Total sum fire   = " + fire + " - Fordeling: " + Math.round(fordelingFire * 100) + "% Forventet: 8.33%");
            System.out.println("Total sum fem    = " + fem + " - Fordeling: " + Math.round(fordelingFem * 100) + "% Forventet: 11.11%");
            System.out.println("Total sum seks   = " + seks + " - Fordeling: " + Math.round(fordelingSeks * 100) + "% Forventet: 13.89%");
            System.out.println("Total sum syv    = " + syv + " - Fordeling: " + Math.round(fordelingSyv * 100) + "% Forventet: 16.67%");
            System.out.println("Total sum otte   = " + otte + " - Fordeling: " + Math.round(fordelingOtte * 100) + "% Forventet: 13.89%");
            System.out.println("Total sum ni     = " + ni + " - Fordeling: " + Math.round(fordelingNi * 100) + "% Forventet: 11.11");
            System.out.println("Total sum ti     = " + ti + " - Fordeling: " + Math.round(fordelingTi * 100) + "% Forventet: 8.33%");
            System.out.println("Total sum elleve = " + elleve + " - Fordeling: " + Math.round(fordelingElleve * 100) + "% Forventet: 5.56%");
            System.out.println("Total sum tolv   = " + tolv + " - Fordeling: " + Math.round(fordelingTolv * 100) + "% Forventet: 2.78%");
        }

        else if (testMenu == 2) {
            //Jeg ved godt vi har halvvejs hardcoded en variabel, når der enten bare burde bruges værdien 6
            //Eller alternativt give brugeren mulighed for at vælge antal sider på terningen, men jeg har ikke tid til at fikse koden nu
            //Feature to be released in later revision
            int terningSideAntal = 6;
            for (i = 0; i < runs; i++) {
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
            }

            System.out.println("PRÆCISIONSGRAD AF FORDELINGEN AF ØJENTAL");
            //Vi skal tage større værdi-mindre værdi her, ikke bare resultat-beregnet, da dette kan give en præcision>100%
            double teoriSnit = 2*(runs * (1 / (double) terningSideAntal));

            double accuracyEt = (et / teoriSnit) * 100;

            double accuracyTo = (to / teoriSnit) * 100;

            double accuracyTre = (tre /teoriSnit) * 100;

            double accuracyFire = (fire / teoriSnit) * 100;

            double accuracyFem = (fem / teoriSnit) * 100;

            double accuracySeks = (seks / teoriSnit) * 100;

            // Test af accuracy - burde altid returnere end værdi på 100
            double totalAccuracy = (accuracyEt + accuracyTo + accuracyTre + accuracyFire + accuracyFem + accuracySeks) / terningSideAntal;

            System.out.print("\ntotalAccuracy returned status: ");
            if ((int) totalAccuracy == 100) {
                System.out.print("ok");
            } else {
                System.out.print("a problem occured");
            }
            System.out.println("\nTeoretisk gennemsnitsgrænse ~" + Math.round(teoriSnit) + " - Da der er 2 terninger");

            System.out.println("Total af etere = " + Math.round(et));
            System.out.println("Total af toere = " + Math.round(to));
            System.out.println("Total af treere = " + Math.round(tre));
            System.out.println("Total af firere = " + Math.round(fire));
            System.out.println("Total af femere = " + Math.round(fem));
            System.out.println("Total af seksere = " + Math.round(seks));


            double lowestAccuracy1 = Math.max(accuracyEt, Math.max(accuracyTo, accuracyTre));
            double lowestAccuracy2 = Math.max(accuracyFire, Math.max(accuracyFem, accuracySeks));
            double lowestAccuracyFinal = Math.max(lowestAccuracy1, lowestAccuracy2);
            System.out.print("\nTerningernes tilfældighed har denne gang en maksimal afvigelse på: ");
            System.out.format("%.2f", (Math.abs(100-lowestAccuracyFinal)));
            System.out.print("%");

        }
    }
}
