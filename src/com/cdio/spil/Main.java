package com.cdio.spil;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i, to2 = 0, to3 = 0 , to4 = 0, to5 = 0, to6 = 0, to7 = 0, to8 = 0, to9 = 0, to10 = 0, to11 = 0, to12 = 0, x, y;
        Random random = new Random();
        for (i = 0; i <= 1000000; i++){
            x = random.nextInt(6) + 1;
            y = random.nextInt(6) + 1;
            if (x+y == 2){
                to2++;
            }
            else if (x+y == 3){
                to3++;
            }
            else if (x+y == 4){
                to4++;
            }
            else if (x+y == 5){
                to5++;
            }
            else if (x+y == 6){
                to6++;
            }
            else if (x+y == 7){
                to7++;
            }
            else if (x+y == 8){
                to8++;
            }
            else if (x+y == 9){
                to9++;
            }
            else if (x+y == 10){
                to10++;
            }
            else if (x+y == 11){
                to11++;
            }
            else if (x+y == 12){
                to12++;
            }
        }
        System.out.println("Total af toere = " + to2);
        System.out.println("Total af trere = " + to3);
        System.out.println("Total af fiere = " + to4);
        System.out.println("Total af femere = " + to5);
        System.out.println("Total af seksere = " + to6);
        System.out.println("Total af syvere = " + to7);
        System.out.println("Total af ottere = " + to8);
        System.out.println("Total af niere = " + to9);
        System.out.println("Total af tiere = " + to10);
        System.out.println("Total af elvere = " + to11);
        System.out.println("Total af tolvere = " + to12);
    }
}
