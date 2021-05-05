package pl.edu.pja;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ZAD02 {
    public static void main(String[] args) throws IOException {
        File input = new File("nazwa.txt");
        //System.out.println(input.exists());
        Stream<String> linesFromFile = Files.lines(input.toPath());
        List<String> listOfLines = linesFromFile.collect(Collectors.toList());

        for(int i = 0; i< listOfLines.size(); i++)
        {
            String line = listOfLines.get(i);
            System.out.println(line);
            String pattern = "\\d+";
            String pattern2 = "[0-9]+";
            boolean isNumber = line.matches(pattern2);
            System.out.println(line + " " + isNumber);

            String pattern3 = "([0-9]+[* | \\- | / | +]*)+";
            boolean isEquation = line.matches(pattern3);
            System.out.println(line + " " + isEquation);
        }
    }
}
