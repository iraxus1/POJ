package pl.edu.pja;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String[] text = new String[]{"Ala", "nie", "ma", "test" , "kota i", "psa", "papugę" };
        System.out.println(zad(2,text));
    }

    private static String zad(int arg, String... args)
    {
        StringJoiner joiner = new StringJoiner(" ");
        for(int i = 1; i <= args.length; i++)
        {
            if( i % arg != 0)
            {
                joiner.add(args[i - 1]);
            }
        }
        return joiner.toString();
    }
}
