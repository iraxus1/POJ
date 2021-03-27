package pl.edu.pja;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ZAD2_2_v2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkosc pierwszej tablicy: ");
        int a = scanner.nextInt();
        System.out.println("Podaj wielkosc drugiej tablicy: ");
        int b = scanner.nextInt();
        int[] Tab1 = new int[a];
        int[] Tab2 = new int[b];
        int[] Tab3 = new int[a];
        int[] emptyArray = {};
        if(a==b)
        {
            for (int i = 0; i < a; i++) {
                int c = rand.nextInt(10);
                int d = rand.nextInt(10);
                Tab1[i] = c;
                Tab2[i] = d;
                Tab3[i] = c + d;
            }
            System.out.println("ZADANIE 2");
            System.out.println("Tablica pierwsza: " + Arrays.toString(Tab1));
            System.out.println("Tablica druga: " + Arrays.toString(Tab2));
            System.out.println("Tablica po dodaniu liczb: " + Arrays.toString(Tab3));
        }
        else
        {
            System.out.println("ZADANIE 2");
            System.out.println("Tablica pusta: " + Arrays.toString(emptyArray));
        }
    }
}