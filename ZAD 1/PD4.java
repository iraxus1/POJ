package pl.edu.pja;


import java.util.Scanner;

public class PD4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number: ");
        double a = scanner.nextDouble();
        System.out.println("Type second number: ");
        double b = scanner.nextDouble();
        System.out.println("Type third number: ");
        double c = scanner.nextDouble();
        if ((a > b) && (a > c) && (b > c)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if ((b > a) && (b > c) && (a > c)) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        else if ((c > b) && (c > a) && (b > a)) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        else if ((c > b) && (c > a) && (a > b)) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
    }
}
