package pl.edu.pja;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Points c1 = new Points(rand.nextInt(10),rand.nextInt(10));
        System.out.println(c1.Location());
        Points c2 = new Points(rand.nextInt(10),rand.nextInt(10));
        System.out.println(c2.Location());
        System.out.println(c1.Length(c2.xValue(),c2.yValue()));
    }
}


