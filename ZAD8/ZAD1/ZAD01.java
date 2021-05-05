package pl.edu.pja;

import java.io.File;
import java.io.IOException;

public class ZAD01 {
    public static void main(String[] args) throws IOException{

        File file = new File("nazwa.txt");
        file.createNewFile();

        boolean fileExist = file.exists();
        System.out.println(fileExist);
        System.out.println(file.getAbsolutePath());

        File direcory = new File("katalog");
        direcory.mkdir();

        System.out.println(direcory.isFile());
        System.out.println(direcory.isDirectory());
    }
}
