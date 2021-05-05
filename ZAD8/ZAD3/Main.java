package pl.edu.pja;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("zad.txt");
        //System.out.println(input.exists());
        Stream<String> linesFromFile = Files.lines(input.toPath());
        List<String> lines = linesFromFile.collect(Collectors.toList());
        int sum = 0;
        boolean liczba = false;
        for(int i = 0; i< lines.size(); i++)
        {
            if (liczba = !liczba) { continue; }
            String line = lines.get(i);
            //System.out.println(line);
            sum += Integer.parseInt(line);
        }
        System.out.println(sum);
    }
}
