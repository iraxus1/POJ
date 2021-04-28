package pl.edu.pja;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name, lastname, birth date:");
        Person person = Main.Create(scanner);
        System.out.println(person);
    }

    private static Person Create(Scanner scanner) {
        try {
            return new Person(scanner.next(), scanner.next(), scanner.next());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid data!\nEnter data again" + e.getMessage());
            return Main.Create(scanner);
        }
    }
}
