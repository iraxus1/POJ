package pl.edu.pja;

import java.util.Arrays;

public class Bookshop extends Shop{
    private String[] products;

    public Bookshop(String adres, int size, String[] products) {
        super(adres, size);
        this.products = products;
    }

    public String getInformation()
    {
        return super.getInformation() + " " + Arrays.toString(this.products);
    }
}
