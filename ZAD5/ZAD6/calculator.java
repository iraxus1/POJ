package pl.edu.pja;

import java.util.Scanner;

public class calculator {
    private double a;
    private double b;
    private double c;

    private void MainMenu()
    {
        System.out.println("[1] Pierwsza metoda: \n[2] Druga metoda: \n[3] Trzecia metoda: \n[4] EXIT");
    }

    public void SwitchCalculator()
    {
        boolean exit = true;
        do {
            MainMenu();
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Podaj liczbe: ");
                    a = scanner.nextDouble();
                    System.out.println("Wynik pierwszej metody: " + Math.pow(a, 2));
                    break;
                }
                case 2:{
                    System.out.println("Podaj pierwsza liczbe: ");
                    a = scanner.nextDouble();
                    System.out.println("Podaj druga liczbe: ");
                    b = scanner.nextDouble();
                    System.out.println("Wynik drugiej metody: " + (a*b));
                    break;
                }
                case 3:
                {
                    System.out.println("Podaj pierwsza liczbe: ");
                    a = scanner.nextDouble();
                    System.out.println("Podaj druga liczbe: ");
                    b = scanner.nextDouble();
                    System.out.println("Podaj trzecia liczbe: ");
                    c = scanner.nextDouble();
                    System.out.println("Wynik trzeciej metody: " + (a+b+c));
                    break;
                }
                case 4: {
                    exit = false;
                    break;
                }
            }
        } while (exit);
    }
}
