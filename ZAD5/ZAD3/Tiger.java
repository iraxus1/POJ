package pl.edu.pja;

public class Tiger extends Car {
    private boolean move;

    public Tiger(String color, String brand, boolean move) {
        super(color, brand);
        this.move = move;
    }
}
