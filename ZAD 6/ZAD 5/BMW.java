package pl.edu.pja;

public class BMW extends Car{

    public BMW(final String color, final int year) {
        super(200, color, "BMW", year);
    }

    public void accelerate() {
        int change = 30;
        if (this.speed + change > this.speedLimit) {
            change = this.speedLimit - this.speed;
        }
        this.speed += change;
    }


}
