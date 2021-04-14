package pl.edu.pja;

import java.util.Arrays;

public class Shop {
    private String adres;
    private int size;

    public Shop(String adres, int size) {
        this.adres = adres;
        this.size = size;
    }

    public String getInformation()
    {
        return adres + " " + String.valueOf(size);
    }
}
