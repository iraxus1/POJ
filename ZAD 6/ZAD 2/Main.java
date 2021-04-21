package pl.edu.pja;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final Order order = new Order(new ArrayList<>());
        order.addPosition(new Position("Chleb", 4, 2));
        order.addPosition(new Position("Banany", 6, 1));
        System.out.println("Order: \n" + order);
    }

}
