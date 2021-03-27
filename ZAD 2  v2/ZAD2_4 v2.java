package pl.edu.pja;
import java.util.Arrays;
public class ZAD2_4_v2 {
    public static void main(String[] args) {
        int[] Tab = {-1,2,-3,4};
        int suma = 0;
        for(int i = 0;i < Tab.length; i++){
            if (Tab[i] > 0){
                suma += Tab[i];
            }
        }
        System.out.println("ZADANIE 4");
        System.out.println(Arrays.toString(Tab));
        System.out.println("Suma liczb dodatnich: " + suma);
    }
}
