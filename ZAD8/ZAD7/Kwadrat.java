package pl.edu.pja;

public class Kwadrat implements Figura{
    private final double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double pole() {
        return Math.pow(this.a, 2);
    }

    @Override
    public double ob() {
        return this.a * 4;
    }
}
