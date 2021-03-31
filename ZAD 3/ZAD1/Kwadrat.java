package pl.edu.pja;

public class Kwadrat {
    public int bok;

    public Kwadrat(int a) {
        this.bok = a;
    }

    public int getPole(){
        return (int) Math.pow(bok, 2);
    }
    public int getObwód(){
        return (bok*4);
    }
}
