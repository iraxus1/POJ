package pl.edu.pja;

public class Homeless extends Car{
    private boolean FromHomeless;

    public Homeless(String color, String brand, boolean fromHomeless) {
        super(color, brand);
        this.FromHomeless = fromHomeless;
    }
}
