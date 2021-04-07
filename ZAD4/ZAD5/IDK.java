package pl.edu.pja;

import java.util.Random;
import java.util.Scanner;

public class IDK {
    private int odleglosc1;
    private int odleglosc2;
    private int odleglosc3;
    private int koniec1;
    private int koniec2;
    private int koniec3;

    private void PrzedstawSie()
    {
        System.out.println("Jestem Robert biegam z prędkością 2-12km /h");
        System.out.println("Twoim pierwszym pzeciwnikiem jest Damian który biega z predkoscia 5-8km /h");
        System.out.println("Twoim drugim pzeciwnikiem jest Adam który biega z predkoscia 1-13km /h");
        System.out.println("[1]: Biegnij");
        System.out.println("[2]: EXIT");
    }

    public void switchBiegi() {
        boolean exit = true;
        do {
            PrzedstawSie();
            int input = new Scanner(System.in).nextInt();
            switch (input) {
                case 1: {
                    Random rand = new Random();
                    do {
                        odleglosc1 = (rand.nextInt(12 - 2) + 2);
                        odleglosc2 = (rand.nextInt(8 - 5) + 5);
                        odleglosc3 = (rand.nextInt(13 - 1) + 1);
                        koniec1 += odleglosc1;
                        koniec2 += odleglosc2;
                        koniec3 += odleglosc3;
                    }while(koniec1 < 50 || koniec2 < 50 || koniec3 < 50);
                    if (koniec1 > 100)
                    {
                        System.out.println("Wygrywa Robert");
                        exit = false;
                        break;
                    }
                    if (koniec2 > 100)
                    {
                        System.out.println("Wygrywa Damian");
                        exit = false;
                        break;
                    }
                    if (koniec3 > 100)
                    {
                        System.out.println("Wygrywa Adam");
                        exit = false;
                        break;
                    }
                    System.out.println("Mecz");
                    System.out.println((koniec1-50) + " " + (koniec2-50) + " " + (koniec3-50));
                    break;
                }
                case 2: {
                    exit = false;
                    break;
                }
            }
        } while (exit);
    }
}
