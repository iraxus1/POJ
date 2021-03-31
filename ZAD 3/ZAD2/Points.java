package pl.edu.pja;

public class Points {
    int x;
    int y;
    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int xValue(){
        return this.x;
    }
    public int yValue(){
        return this.y;
    }
    public double Length(int x2, int y2){
        double odleglosc = Math.sqrt(Math.pow((double)this.x - (double)x2, 2) + Math.pow((double)this.y - (double)y2, 2));
        return odleglosc;
    }
    String Location(){
        return("X:" + this.xValue() +"\n" + "Y:" + this.yValue());
    }
}


