package pl.edu.pja;

interface SomeInterface {
    int doSmth(int a);
    float doSmth(int a, int b);
    int doSmth(float a, float b);
    int doSmth(float a, int b);
    int doSmth(int a, float b);
    int doSmth(Integer a, Integer b);
    int doSmth(int a, Integer b);
    int doSmth(Integer a, int b);
    int doSmth(int a, int b, int c);
    int doSmth(int...a);
    int doSmth(int a, int...b);
    int doSmth(int a, int b, int...c);
}

public class App {

    public static  void main(String[] args)
    {
        xyz(null);
    }

    public static void xyz(final Object o)
    {
        System.out.println("L");
    }

    public static void xyz(final String o)
    {
        System.out.println("S");
    }
}
