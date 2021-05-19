package pl.edu.pja;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Map <String, Integer> map = new HashMap<>();
        String sentence = ("Czarna krowa w kropki bordo gryzła trawę kręcąc mordą kręcąc mordą i rogami gryzła trawę wraz z jaskrami");
        String[] spaces = sentence.split(" ");
        for (String space: spaces) {
            String word = space.toLowerCase();
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        Set<String> keys = map.keySet();
        TreeSet<String> countedWords = new TreeSet<>(keys);
        for (String words : countedWords) {
            System.out.println(words + " : " + map.get(words));
        }
    }
}

