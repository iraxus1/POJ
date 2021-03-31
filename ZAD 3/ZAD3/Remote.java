package pl.edu.pja;

import java.util.Scanner;

public class Remote {
    public static void main(String[] args) {
        System.out.println("Do you want to turn ON your TV?\nYES - 1\nNO - 2\nYour choice: ");
        int on = new Scanner(System.in).nextInt();
        if(on == 1)
        {
            TV1 tv = new TV1();
            tv.switchTV();
        }
        if(on == 2) {
            System.out.println("TV OFF");
        }

}
}
