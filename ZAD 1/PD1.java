package pl.edu.pja;

public class PD1 {
    private static final double C_TO_K = 273.15;
    public static void main(String[] args) {
        System.out.println("Celsius \t Kelvin");

        for(int i=1; i<=10; i++){
            double c=i+C_TO_K;
            System.out.println(i+"\t\t "+c);
        }

    }
}
