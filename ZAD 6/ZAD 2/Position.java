package pl.edu.pja;

public class Position {
    private final String name;
    private final double price;
    private final int quantiny;

    public Position(String name, double price, int quantiny) {
        this.name = name;
        this.price = price;
        this.quantiny = quantiny;
    }

    public double quantityPrice()
    {
        return  this.quantiny * this.price;
    }

    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantiny=" + quantiny +
                ", total=" + quantityPrice() +
                '}';
    }
}
