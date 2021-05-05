package pl.edu.pja;

public class Prostokat implements Figura{
    private final double a;
    private final double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double pole() {
        return this.a * this.b;
    }

    @Override
    public double ob() {
        return this.a * 2 + this.b * 2;
    }
}
