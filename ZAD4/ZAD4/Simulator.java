package pl.edu.pja;

import java.util.Random;
import java.util.Scanner;

public class Simulator {
    private double reszka;
    private double orzel;
    private double procent1;
    private double procent2;

    public void Moneta()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe rzutow: ");
        double rzuty = scanner.nextInt();
        Random rand = new Random();
        for(int i = 0; i < rzuty; i++) {
            int liczba = (rand.nextInt(2));
            if (liczba == 1) {
                reszka++;
            } else if (liczba == 0) {
                orzel++;
            }
        }
        procent1 = (reszka/rzuty) * 100;
        procent2 = (orzel/rzuty) * 100;
        System.out.println("Liczba reszek: " + procent1 + "%" + "\n" + "Liczba orlow: " + procent2 + "%\n" + "dla " + rzuty + " rzutow");
    }
}
