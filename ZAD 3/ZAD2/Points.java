package pl.edu.pja;

public class Points {
    int x;
    int y;
    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public double Length(int x2, int y2){
        double odleglosc = Math.sqrt(Math.pow((double)x - (double)x2, 2) + Math.pow((double)y - (double)y2, 2));
        return odleglosc;
    }
    String Location(){
        return("X:" + getx() +"\n" + "Y:" + gety());
    }
}


