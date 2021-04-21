package pl.edu.pja;

import java.util.Objects;

public abstract class Car {
    protected int speed;
    protected int speedLimit;
    private final String color;
    private final String manufacturer;
    private final int manufactureYear;

    public Car(int speedLimit, String color, String manufacturer, int manufactureYear) {
        this.speedLimit = speedLimit;
        this.color = color;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
        this.speed = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", speedLimit=" + speedLimit +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufactureYear=" + manufactureYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && speedLimit == car.speedLimit && manufactureYear == car.manufactureYear && Objects.equals(color, car.color) && Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speedLimit, color, manufacturer, manufactureYear);
    }
}
