package pl.edu.pja;
public class ZAD2_3_v2 {
    public static void main(String[] args) {

        int[][] tab1 = new int[3][];
        int[][] tab2 = new int[3][];
        tab1[0] = new int[3];
        tab1[1] = new int[3];
        tab1[2] = new int[3];
        tab2[0] = new int[3];
        tab2[1] = new int[3];
        tab2[2] = new int[3];
        
        tab1[0][0] = 2;
        tab1[0][1] = 4;
        tab1[0][2] = 2;

        tab1[1][0] = 4;
        tab1[1][1] = 5;
        tab1[1][2] = 4;

        tab1[2][0] = 8;
        tab1[2][1] = 5;
        tab1[2][2] = 3;

        tab2[0][0] = 2;
        tab2[0][1] = 1;
        tab2[0][2] = 5;

        tab2[1][0] = 3;
        tab2[1][1] = 5;
        tab2[1][2] = 9;

        tab2[2][0] = 2;
        tab2[2][1] = 7;
        tab2[2][2] = 2;
        
        int suma = 0;
        for (int i = 0; i < tab1.length; i++)
        {
            for (int j = 0; j < tab1[i].length; j++)
            {
                suma += tab1[i][j] + tab2[i][j];
            }
        }
        System.out.println("ZADANIE TRZECIE");
        System.out.println("Suma obu macierzy wynosi: " + suma);
    }
}

