package pl.edu.pja;

public class App {
    public static void main(String[] args) {
        Local local1 = new Local("Merapar Poland", "Arkońska", "Gdańsk", "80-387", "6");
        Local local2 = new Local("CityFit", "aleja Grunwaldzka", "Gdańsk", "80-309", "472d");
        Local local3 = new Local("Po Prostu Kwiaty", "Jana Kilińskiego", "Gdańsk", "80-452", "9/U2B");

        System.out.println(local1);
        System.out.println(local2);
        System.out.println(local3);
    }
}
