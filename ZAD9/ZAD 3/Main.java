package pl.edu.pja;

public class Main {
    public static void main(final String[] args) {
        final Integer[] integers = new Integer[] {
                420, 666, 56, 999, 2137, 423, 123, 432
        };

        for (int i = 0; i < integers.length; i++)
        {
            System.out.println(integers[i]);
        }

        System.out.println("Integer MAX: " + findMax(integers) + "\n");

        final String[] strings = new String[] {
                "das", "rew", "hgf", "jhg", "oiu", "fghh", "bbcv"
        };

        for (int i = 0; i < strings.length; i++)
        {
            System.out.println(strings[i]);
        }

        System.out.println("String MAX: " + findMax(strings) + "\n");

    }

    public static <T extends Comparable<T>> T findMax(final T[] array) {
        T max = array[0];
        for (int i = 0; i <array.length; i++)
        {
            T key = array[i];
            if (key.compareTo(max) > 0)
            {
                max = key;
            }
        }
        return max;
    }
}