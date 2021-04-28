package pl.edu.pja;

public class Main {

    public static int sum = 0;

    public static void main(String[] args) {
        sum = sum(new int[]{10,2},new int[]{10,2}, new int[]{10,2});
        System.out.println("Sum: " + sum);
    }

    private static int sum(final int[] ... numberArrays)
    {
        int sum = 0;
        for(final int[] numbers : numberArrays)
        {
            for (final int number : numbers)
            {
                sum += number;
            }
        }
        return sum;
    }
}
