package pl.edu.pja;

import java.util.Arrays;

public class Bakery extends Shop{
    private String[] products;

    public Bakery(String adres, int size, String[] products) {
        super(adres, size);
        this.products = products;
    }

    public String getInformation()
    {
        return super.getInformation() + " " + Arrays.toString(this.products);
    }
}
