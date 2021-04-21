package pl.edu.pja;

public class Main {
    public static void main(String[] args) {
        final Time time = new Time(29, 14);
        final Time timeV2 = new Time (20, 20);

        System.out.println("Time : " + time);
        System.out.println("TimeV2: " + timeV2);
        System.out.println("Add Time: " + time.add(timeV2));
        System.out.println("Multi time: " + time.mult(2));
    }
}
