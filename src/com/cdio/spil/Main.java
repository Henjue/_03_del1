package com.cdio.spil;
import java.util.Random;
import java.util.Scanner;
//Alpha test BEGIN!!!
public class Main {
    public static void main(String[] args) {
        int x, y, player_1 = 0, player_2 = 0;
        boolean p1win = false, p2win = false;
        String b;
        Scanner spil;
        while (!p1win && !p2win) {
            Random random = new Random();
            spil = new Scanner(System.in);
            if (player_1 < 40) {
                System.out.println("\n" + "Player 1, press enter to roll the die");
                b = spil.nextLine();
                x = random.nextInt(6) + 1;
                y = random.nextInt(6) + 1;
                System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                player_1 = player_1 + x + y;
                System.out.println("Player 1 score is " + player_1);
                spil = new Scanner(System.in);
                if (x == 1 && y == 1) {
                    System.out.println("Player 1 has rolled two " + x + "'s\n and loses all points");
                    System.out.println("Press enter to continue...");
                    player_1 = 0;
                    System.out.println("\n" + "Player 1 score is " + player_1);
                }
                while (x == y && x != 6) {
                    if (player_1 >= 40)
                        break;
                    System.out.println("Player 1 has rolled two identical and therefore get another throw");
                    System.out.println("Press enter to continue...");
                    b = spil.nextLine();
                    x = random.nextInt(6) + 1;
                    y = random.nextInt(6) + 1;
                    System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                    player_1 = player_1 + x + y;
                    System.out.println("Player 1 score is " + player_1);
                    spil = new Scanner(System.in);
                    if (x != y)
                        break;
                }
                while (x == y) {
                    if (player_1 >= 40)
                        break;
                    System.out.println("Player 1 has rolled two sixes and therefore get another throw");
                    System.out.println("Press enter to continue...");
                    b = spil.nextLine();
                    x = random.nextInt(6) + 1;
                    y = random.nextInt(6) + 1;
                    System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                    player_1 = player_1 + x + y;
                    System.out.println("Player 1 score is " + player_1);
                    spil = new Scanner(System.in);
                    if (x == y && x == 6) {
                        System.out.println("Player 1 has rolled double six twice in a row and wins the game");
                        break;
                    }
                }
            }
            if (player_2 < 40) {
                System.out.println("\n" + "Player 2, press enter to roll the die");
                b = spil.nextLine();
                x = random.nextInt(6) + 1;
                y = random.nextInt(6) + 1;
                System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                player_2 = player_2 + x + y;
                System.out.println("Player 2 score is " + player_2);
                if (x == 1 && y == 1) {
                    System.out.println("Player 2 has rolled two " + x + "'s\n and loses all points");
                    System.out.println("Press enter to continue...");
                    player_2 = 0;
                    System.out.println("\n" + "Player 2 score is " + player_2);
                }
                while (x == y && x != 6) {
                    if (player_2 >= 40)
                        break;
                    System.out.println("Player 2 has rolled two identical and therefore get another throw");
                    System.out.println("Press enter to continue...");
                    b = spil.nextLine();
                    x = random.nextInt(6) + 1;
                    y = random.nextInt(6) + 1;
                    System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                    player_2 = player_2 + x + y;
                    System.out.println("Player 2 score is " + player_2);
                    spil = new Scanner(System.in);
                    if (x != y)
                        break;
                }
                while (x == y) {
                    if (player_2 >= 40)
                        break;
                    System.out.println("Player 2 has rolled two sixes and therefore get another throw");
                    System.out.println("Press enter to continue...");
                    b = spil.nextLine();
                    x = random.nextInt(6) + 1;
                    y = random.nextInt(6) + 1;
                    System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                    player_2 = player_2 + x + y;
                    System.out.println("Player 2 score is " + player_2);
                    spil = new Scanner(System.in);
                    if (x == y && x == 6) {
                        System.out.println("Player 2 has rolled double six twice in a row and wins the game");
                        break;
                    } else if (x != y)
                        break;
                }
            }
            if (player_1 >= 40) {
                while (player_1 >= 40 && player_2 < 40) {
                    System.out.println("\n" + "Since player 1 has 40+ points, they need to roll two identical to win");
                    b = spil.nextLine();
                    x = random.nextInt(6) + 1;
                    y = random.nextInt(6) + 1;
                    System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                    if (x == y && x == 1) {
                        System.out.println("Player 1 has rolled two " + x + "'s\n and loses all points");
                        System.out.println("Press enter to continue...");
                        player_1 = 0;
                        System.out.println("\n" + "Player 1 score is " + player_1);
                    } else if (x == y) {
                        System.out.println("Player 1 wins the game");
                        p1win = true;
                        break;
                    }
                    System.out.println("Player 2, press enter to roll the die");
                    b = spil.nextLine();
                    x = random.nextInt(6) + 1;
                    y = random.nextInt(6) + 1;
                    System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                    player_2 = player_2 + x + y;
                    System.out.println("Player 2 score is " + player_2);
                    if (x == y && x == 1) {
                        System.out.println("Player 2 has rolled two " + x + "'s\n and loses all points");
                        System.out.println("Press enter to continue...");
                        player_2 = 0;
                        System.out.println("\n" + "Player 2 score is " + player_2);
                    }
                    while (player_1 >= 40 && player_2 >= 40) {
                        System.out.println("Since player 1 has 40+ points, they need to roll two identical to win\n Press enter to roll the die");
                        b = spil.nextLine();
                        x = random.nextInt(6) + 1;
                        y = random.nextInt(6) + 1;
                        System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                        if (x == y && x == 1) {
                            System.out.println("Player 1 has rolled two " + x + "'s\n and loses all points");
                            System.out.println("Press enter to continue...");
                            player_1 = 0;
                            System.out.println("\n" + "Player 1 score is " + player_1);
                        } else if (x == y) {
                            System.out.println("Player 1 wins the game");
                            p1win = true;
                            break;
                        }
                        System.out.println("Since player 2 has 40+ points, they need to roll two identical to win\\n Press enter to roll the die");
                        b = spil.nextLine();
                        x = random.nextInt(6) + 1;
                        y = random.nextInt(6) + 1;
                        System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                        if (x == y && x == 1) {
                            System.out.println("Player 2 has rolled two " + x + "'s\n and loses all points");
                            System.out.println("Press enter to continue...");
                            player_2 = 0;
                            System.out.println("\n" + "Player 2 score is " + player_2);
                        } else if (x == y) {
                            System.out.println("Player 2 wins the game");
                            p2win = true;
                            break;
                        }
                    }
                }
            }
            if (player_2 >= 40) {
                while (player_2 >= 40 && player_1 < 40) {
                    System.out.println("\n" + "Since player 2 has 40+ points, they need to roll two identical to win\n Press enter to roll the die");
                    b = spil.nextLine();
                    x = random.nextInt(6) + 1;
                    y = random.nextInt(6) + 1;
                    System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                    System.out.println("Player 1, press enter to roll the die");
                    if (x == y && x == 1) {
                        System.out.println("Player 2 has rolled two " + x + "'s\n and loses all points");
                        System.out.println("Press enter to continue...");
                        player_2 = 0;
                        System.out.println("\n" + "Player 2 score is " + player_2);
                    }
                    else if (x == y) {
                        System.out.println("Player 2 wins the game");
                        p2win = true;
                        break;
                    }
                    b = spil.nextLine();
                    x = random.nextInt(6) + 1;
                    y = random.nextInt(6) + 1;
                    System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                    player_1 = player_1 + x + y;
                    System.out.println("Player 1 score is " + player_1);
                    if (x == y && x == 1) {
                        System.out.println("Player 2 has rolled two " + x + "'s\n and loses all points");
                        System.out.println("Press enter to continue...");
                        player_1 = 0;
                        System.out.println("\n" + "Player 1 score is " + player_1);
                    }
                }
                while (player_2 >= 40 && player_1 >= 40) {
                    System.out.println("Since player 2 has 40+ points, they need to roll two identical to win\n Press enter to roll the die");
                    b = spil.nextLine();
                    x = random.nextInt(6) + 1;
                    y = random.nextInt(6) + 1;
                    System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                    if (x == y && x == 1) {
                        System.out.println("Player 2 has rolled two " + x + "'s\n and loses all points");
                        System.out.println("Press enter to continue...");
                        player_2 = 0;
                        System.out.println("\n" + "Player 2 score is " + player_2);
                    } else if (x == y) {
                        System.out.println("Player 2 wins the game");
                        p2win = true;
                        break;
                    }
                    System.out.println("Since player 1 has 40+ points, they need to roll two identical to win\n Press enter to roll the die");
                    b = spil.nextLine();
                    x = random.nextInt(6) + 1;
                    y = random.nextInt(6) + 1;
                    System.out.println("Dice One: " + x + "\n" + "Dice Two: " + y);
                    if (x == y && x == 1) {
                        System.out.println("Player 1 has rolled two " + x + "'s\n and loses all points");
                        System.out.println("Press enter to continue...");
                        player_1 = 0;
                        System.out.println("\n" + "Player 1 score is " + player_2);
                    } else if (x == y) {
                        System.out.println("Player 1 wins the game");
                        p1win = true;
                        break;
                    }
                }
            }
        }
    }
}
