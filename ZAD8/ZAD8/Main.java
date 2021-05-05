package pl.edu.pja;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final Students[] students = new Students[]
                {
                        new Students("Adam", "Konieczny", "s22666"),
                        new Students("Jakub", "Mostowiak", "s22420"),
                };
        Arrays.sort(students);

        System.out.println(Arrays.toString(students));
    }
}
