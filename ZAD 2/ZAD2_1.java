package pl.edu.pja;

import java.util.Arrays;
import java.util.Scanner;

public class ZAD2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wielkość tablicy: ");
        int x = scanner.nextInt();
        String[] Tablica = new String[x];
        int i = 0;
        String znak = " ";
        System.out.println("Jaki znak chcesz dodać do tablicy:");
        znak = scanner.nextLine();
        while (x > i){
            znak = scanner.nextLine();
            System.out.println("Jaki znak chcesz dodać do tablicy:");

            Tablica[i] = znak;
            i++;
        }
        System.out.println("ZADANIE 1");
        System.out.println(Arrays.toString(Tablica));
    }
}