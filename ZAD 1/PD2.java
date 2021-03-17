package pl.edu.pja;

import java.util.Scanner;

public class PD2 {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number of students: ");
        int nos = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Type name of student: ");
        name = scanner.nextLine();
        System.out.println("Type points: ");
        int points = scanner.nextInt();
        for( int i = 0; i < nos - 1; i++) {
            scanner.nextLine();
            System.out.println("Type name of student: ");
            String name1 = scanner.nextLine();

            System.out.println("Type points: ");
            int points1 = scanner.nextInt();

            if(points < points1)
            {
                name = name.replace(name, name1);
                points = points1;
            }
        }
        System.out.println("Best student: "+name+" with "+points+ " points");
    }
}


