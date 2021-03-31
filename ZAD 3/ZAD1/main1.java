package pl.edu.pja;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długosc boku: ");
        int a = scanner.nextInt();
        Kwadrat kwadrat = new Kwadrat(a);

        System.out.println("Obwód wynosi: " + kwadrat.getObwód());
        System.out.println("Pole wynosi: " + kwadrat.getPole());
    }
}
