package pl.edu.pja;

import java.util.Random;
import java.util.Scanner;

public class PD5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int losowanie;
        String wybor;

        System.out.println("Wpisz 1 (papier), 2 (kamień) lub 3 (nożyce).");

        String wynik;
        wybor = scan.nextLine();
        int liczba = Integer.parseInt(wybor);

        losowanie = rnd.nextInt(4) + 1;

        if (liczba == 1 || liczba == 2 || liczba == 3) {
            if (liczba == 1) {
                System.out.println("Twój wybór to: papier.");
            } else if (liczba == 2) {
                System.out.println("Twój wybór to: kamień.");
            } else {
                System.out.println("Twój wybór to: nożyce.");
            }
            if (losowanie == 1) {
                System.out.println("Wylosowano \"papier\".");

                if (liczba == 3) {
                    System.out.println("Wygrana");
                    wynik = "wygrana";
                } else if (liczba == 2) {
                    System.out.println("Przegrana");
                    wynik = "przegrana";
                } else {
                    System.out.println("Remis");
                    wynik = "remis";
                }
            } else if (losowanie == 2) {
                System.out.println("Wylosowano \"kamień\".");

                if (liczba == 1) {
                    System.out.println("Wygrana");
                    wynik = "wygrana";
                } else if (liczba == 3) {
                    System.out.println("Przegrana");
                    wynik = "przegrana";
                } else {
                    System.out.println("Remis");
                    wynik = "remis";
                }

            } else {
                System.out.println("Wylosowano \"nożyce\".");

                if (liczba == 2) {
                    System.out.println("Wygrana");
                    wynik = "wygrana";
                } else if (liczba == 1) {
                    System.out.println("Przegrana");
                    wynik = "przegrana";
                } else {
                    System.out.println("Remis");
                    wynik = "remis";
                }
            }
        }
    }
}





