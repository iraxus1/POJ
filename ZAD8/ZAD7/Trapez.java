package pl.edu.pja;

public class Trapez implements Figura{
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double h;

    public Trapez(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double pole() {
        return ((this.a + this.c)*this.h)/2;
    }

    @Override
    public double ob() {
        return this.a + this.b + this.c + this.d;
    }
}
