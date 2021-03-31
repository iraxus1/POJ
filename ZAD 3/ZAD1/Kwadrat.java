package pl.edu.pja;

public class Kwadrat {
    private int bok;
    public Kwadrat(int bok){
        this.bok = bok;
    }
    public int getPole(){
        return (int) Math.pow(bok, 2);
    }
    public int getObwód(){
        return (bok*4);
    }
}
