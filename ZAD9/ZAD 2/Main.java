package pl.edu.pja;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[]
                {
                        new Player("Adam", "Nadolski", 8, 11.2),
                        new Player("Maciek", "Jurewicz", 2, 15.7),
                        new Player("Jan", "Kadamier", 13, 8.2),
                };
        Arrays.sort(players, Player::compareTo);
        System.out.println(Arrays.toString(players));
        RankingComparator rankingComparator = new RankingComparator();
        Arrays.sort(players, rankingComparator);
        System.out.println(Arrays.toString(players));
    }
}
