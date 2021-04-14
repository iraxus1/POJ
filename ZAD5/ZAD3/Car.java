package pl.edu.pja;

public class Car {
    private String color;
    private String brand;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
