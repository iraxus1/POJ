package pl.edu.pja;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczby od 1-49");
        Scanner input = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        for(int i = 6; i != 0; i--)
        {
            System.out.println("Podaj " + i + " liczbe");
            int liczba = input.nextInt();
            if(liczba > 50 || liczba < 0)
            {
                System.out.println("Podaj liczbe jeszcze raz");
                i++;
            }
            else
            {
                numbers.add(liczba);
            }
        }
        Random random = new Random();
        Set<Integer> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size() < 6) {
            lottoNumbers.add(random.nextInt(49) + 1);
        }
        int counter = 0;
        for (Integer numb : numbers) {
            if (lottoNumbers.contains(numb)) {
                counter++;
            }
        }
        System.out.println("Twoje liczby: " + numbers);
        System.out.println("Wygenerowane liczby: " + lottoNumbers);
        System.out.println("Twoje trafienia: " + counter);
    }
}

