package pl.edu.pja;

public class Main {
    public static void main(String[] args) {
        final BMW bmw = new BMW("Red", 2000);
        for (int i = 0; i < 10; i++) {
            System.out.println(bmw);
            bmw.accelerate();
        }
    }
}
