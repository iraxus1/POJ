package pl.edu.pja;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Car[] car = new Car[]
        {
            new Car("White", "Tesla"),
            new Homeless("Black", "Volkswagen", true),
            new F16("Gray", "Lockheed Martin", true),
            new Tiger("Sand", "Henschel und Sohn", false)
        };
        for (Car elements:car) {
            System.out.println(elements.toString());
        }
    }
}
