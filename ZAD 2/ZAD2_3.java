package pl.edu.pja;
public class ZAD2_3 {
    public static void main(String[] args) {
        int[] Tablica = {4,-2,2137,-26,25,-21};
        int i = 0;
        int c = 0;
        while (i< Tablica.length){
            if (Tablica[i] > 0){
                c = c+Tablica[i];
            }
            i++;
        }
        System.out.println("ZADANIE 3");
        System.out.println(c);
    }
}
