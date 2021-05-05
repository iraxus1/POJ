package pl.edu.pja;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>()
        {
            {
                add(new Kwadrat(4));
                add(new Prostokat(2, 4));
                add(new Trapez(2,3,4,5,4));
            }
        };
        for(final Figura figura : figuras)
        {
            System.out.println(figura.getClass().getSimpleName() + ", pole: " + figura.pole() + ", ob: " + figura.ob());
        }
    }
}
